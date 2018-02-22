/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mantenimientodatalib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class ProcesadorArchivosTest {
    
    public ProcesadorArchivosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarArchivo method, of class ProcesadorArchivos.
     */
    @org.junit.Test
    public void testValidarArchivo() {
        System.out.println("validarArchivo");
        String path = "src/test/sources/leeme.txt";
        ProcesadorArchivos instance = new ProcesadorArchivos();
        boolean expResult = false;
        boolean result = instance.validarArchivo(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of objetosSeparados method, of class ProcesadorArchivos.
     */
    @Test
    public void testObjetosSeparados() {
        System.out.println("objetosSeparados");
        String cadena = "hola estas leyendo lo que he escrito, asi que liala papa, enserio\n" +
"sas\n" +
"sasfdf\n" +
"sasa fdfdfd\n" +
"salskas skrrrr";
        ProcesadorArchivos instance = new ProcesadorArchivos();
        String[] expResult = {"hola estas leyendo lo que he escrito"," asi que liala papa"," enserio\nsas\nsasfdf\nsasa fdfdfd\nsalskas skrrrr"};
        String[] result = instance.objetosSeparados(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
