package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import boletinJUnit.*;

public class Test_Pila {
	
	private static Pila pi;
	
	@BeforeEach
	public void init() {
		pi = new Pila();
	}
	
	@Test
	public void Pruebas() {
		assertTrue(pi.isEmpty());
		assertEquals(null,pi.top());
		pi.push(3);
		assertFalse(pi.isEmpty());
		assertEquals(3,pi.top());
		pi.push(21);
		assertFalse(21==pi.pop());
	}
	
	@AfterEach
	public void fin() {
		pi=null;
	}
	
}
