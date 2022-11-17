/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calculadora.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PruebasOperaciones {
    
    Operaciones operaciones;
    
    public PruebasOperaciones() {
        operaciones = new Operaciones();
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Método único antes de la clase ");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Método al finalizar la clase");
    }
    
    
    @Before
    public void setUp() {
        System.out.println("Inicio de método");
    }
    
    @After
    public void tearDown() {
        System.out.println("Fin de método");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void PruebasumarListaNumeros(){
        long[] listaNumeros = new long[]{1, 2, 3, 4, 5, 6};
        assertEquals(21, operaciones.Sumar(listaNumeros));
        
    }
    
    @Test
    public void PruebasumarNumeros(){
        long num1 = 3;
        long num2 = 5;
        assertEquals(8, operaciones.Sumar(num1, num2));
        
    }
    
    @Test
    public void PruebarestarNumeros(){
        long num1 = 3;
        long num2 = 5;
        assertEquals(-2, operaciones.Restar(num1, num2));
        
    }
     
    @Test
    public void PruebaMultiplicarNumeros(){
    long num1 = 3;
    long num2 = 5;
    assertEquals(15, operaciones.Multiplicar(num1, num2));    
    }
    
    @Test
    public void PruebamultiplicarListaNumeros(){
    long[] listaNumeros = new long[]{1, 2, 3, 4, 5, 6};
    assertEquals(720, operaciones.Multiplicar(listaNumeros));   
    }
    
    @Test
    public void PruebaDividirNumeros(){
    long num1 = 10;
    long num2 = 5;
    assertEquals(2, operaciones.Dividir(num1, num2), 0.00000001);   
    }
    
    @Test (expected = ArithmeticException.class )
    public void PruebaDividirNumerosxEcepción(){
    long num1 = 10;
    long num2 = 0;
    assertEquals(ArithmeticException.class, operaciones.Dividir(num1, num2));  
    }
     
    
}

