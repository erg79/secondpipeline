package com.example.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import com.example.calculadora.Calculadora;

public class CalculadoraSumaTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para sumar dos números
	 */
	@Test
	public void testSumaDosNumeros(){
		//Definimos los números a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 3;
		//Llamamos al método a testear
		int suma = Calculadora.sumar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}
	
	
	/**
	 * Test para sumar dos números invertidos. 
	 */
	@Test
	public void testSumaDosNumerosInvertidos(){
		//Definimos los números a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 3;
		//Llamamos al método a testear
		int suma = Calculadora.sumar(num2, num1);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}

	/**
	 * Test para sumar cero
	 */
	@Test
	public void testSumaCero(){
		//Definimos los números a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 2;
		//Llamamos al método a testear
		int suma = Calculadora.sumar(num2, num1);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}
	
	/**
	 * Test para sumar cero invertido
	 */
	@Test
	public void testSumaCeroInvertido(){
		//Definimos los números a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 2;
		//Llamamos al método a testear
		int suma = Calculadora.sumar(num2, num1);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}
	
}
