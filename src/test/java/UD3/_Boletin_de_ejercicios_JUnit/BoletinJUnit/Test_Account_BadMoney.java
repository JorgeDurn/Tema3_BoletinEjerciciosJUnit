package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import boletinJUnit.*;

public class Test_Account_BadMoney {
    private static Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("John Doe", 123456789, 1000.0f);
    }

    @Test
    public void testPrecision() {
        account.deposit(0.1f);
        account.withdraw(0.1f, 0.0f);
        account.deposit(0.2f);
        account.withdraw(0.2f, 0.0f);
        account.deposit(0.3f);
        account.withdraw(0.3f, 0.0f);
        assertEquals(1000.0f, account.getBalance(), 0.01f);
    }
}
