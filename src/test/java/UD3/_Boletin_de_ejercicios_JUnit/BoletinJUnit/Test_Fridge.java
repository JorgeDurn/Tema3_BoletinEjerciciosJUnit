package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import boletinJUnit.*;

public class Test_Fridge {
	private static Fridge fri;
	
	@BeforeEach
	public void init() {
		fri=new Fridge();
	}
	
	@Test
	public void PruebasFridge(){
		assertTrue(fri.put("pru"));
		assertTrue(fri.contains("pru"));
	}
	
	@Test
	public void PruebasThrowsFridge() throws NoSuchItemException{
		fri.put("pru");
		fri.take("pru");
		assertFalse(fri.contains("pru"));
	}
}
