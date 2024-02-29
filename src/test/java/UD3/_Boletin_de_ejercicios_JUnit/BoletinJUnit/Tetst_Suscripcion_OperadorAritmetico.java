package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import boletinJUnit.*;

public class Tetst_Suscripcion_OperadorAritmetico {

	private static Subscripcion sus;

	@BeforeEach
	public void init() {
		sus = new Subscripcion(10, 5);
	}


	@Test
	public void PruebaSuscripcion() {
		assertTrue(sus.precioPorMes() == 2);
		sus.cancel();
		assertEquals(0, sus.precioPorMes());

	}

	@Test
	public void PruebaOperador() throws Exception {
		assertEquals(7, OperadorAritmetico.suma(5, 2));
		assertEquals(5, OperadorAritmetico.division(10, 2));
	}

	@AfterEach
	public void fin() {
		sus = null;
	}

}
