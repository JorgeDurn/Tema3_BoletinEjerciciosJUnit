package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import boletinJUnit.*;

public class Test_Account {
    private static Account account;

    @BeforeEach
    public void ini() {
        account = new Account("Persona 1", 123456789, 1000f);
    }

    @Test
    public void testDeposito() {
        assertTrue(account.deposit(500f));
        assertEquals(1500f, account.getBalance());
        
        assertFalse(account.deposit(-500f));
        assertEquals(1500f, account.getBalance());
    }
//testWithdrawSufficientFunds
    @Test
    public void testWithdraw() {
        assertTrue(account.withdraw(500f, 0f));
        assertEquals(500f, account.getBalance());
        
        assertFalse(account.withdraw(1500f, 0f));
        assertEquals(500f, account.getBalance());
        
        assertFalse(account.withdraw(1500f, 0f));
        assertEquals(500f, account.getBalance());
        
        assertFalse(account.withdraw(-500f, 0f));
        assertEquals(500f, account.getBalance());
        
        assertFalse(account.withdraw(500f, -50f));
        assertEquals(500f, account.getBalance());
        
        assertTrue(account.withdraw(0f, 50f));
        assertEquals(450f, account.getBalance());
    }

    @Test
    public void testInteres() {
        account.addInterest();
        assertEquals(1045f, account.getBalance());
    }

    @Test
    public void testToString() {
    	assertEquals("123456789	Persona 1	1.000,00 €", account.toString());
    }
    
    @AfterEach
    public void fin() {
        account = null;
    }
    
}