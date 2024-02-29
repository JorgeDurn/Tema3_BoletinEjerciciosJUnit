package UD3._Boletin_de_ejercicios_JUnit.BoletinJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ Test_Fridge.class, Test_Pila.class, Test_Suite.class, Tetst_Suscripcion_OperadorAritmetico.class })
public class Test_Suite {

}
