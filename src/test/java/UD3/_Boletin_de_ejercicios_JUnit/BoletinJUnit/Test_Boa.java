package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import boletinJUnit.*;

public class Test_Boa {
	
	private static Boa bo,bo2;
	
	@BeforeEach
	public void ini() {
		bo= new Boa("nombre",15,"comida");
		bo2=new Boa ("boa2",20,"granola bars");
	}
	
	@Test
	public void PruebasFalseBoa() {
		assertFalse(bo.isHealthy());
		assertFalse(bo.fitsInCage(10));
	}

	@Test
	public void PruebasTrueBoa() {
		assertTrue(bo2.isHealthy());
		assertTrue(bo2.fitsInCage(25));
	}
	
	@AfterEach
	public void fin() {
		bo=null;
		bo2=null;
	}
	

}
