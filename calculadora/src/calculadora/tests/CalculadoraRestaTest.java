package com.example.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import com.example.calculadora.Calculadora;

public class CalculadoraRestaTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para restar dos números
	 */
	@Test
	public void testRestaDosNumeros(){
		//Definimos los números a sumar
		int num1 = 2;
		int num2 = 1;
		//Definimos el resultado de la suma
		int resultado = 1;
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
	
	/**
	 * Test para restar dos números invertidos. 
	 */
	@Test
	public void testRestaDosNumerosInvertidos(){
		//Definimos los números a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = -1;
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}

	/**
	 * Test para restar cero
	 */
	@Test
	public void testRestaCero(){
		//Definimos los números a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 2;
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
	/**
	 * Test para restar cero invertido
	 */
	@Test
	public void testRestaCeroInvertido(){
		//Definimos los números a sumar
		int num1 = 0;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = -2;
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
}
