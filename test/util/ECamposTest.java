/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilmer Quito
 */
public class ECamposTest {
    
    public ECamposTest() {
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
     * Test of buscarBotones method, of class ECampos.
     */
    @Test
    public void testBuscarBotones() {
        System.out.println("buscarBotones");
        Component cm = null;
        boolean habilitar = false;
        Component[] excepcion = null;
        ECampos.buscarBotones(cm, habilitar, excepcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditableTexto method, of class ECampos.
     */
    @Test
    public void testSetEditableTexto() {
        System.out.println("setEditableTexto");
        Component cm = null;
        boolean habilitar = false;
        Component[] excepcion = null;
        boolean limpiar = false;
        String valor = "";
        ECampos.setEditableTexto(cm, habilitar, excepcion, limpiar, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esObligatorio method, of class ECampos.
     */
    @Test
    public void testEsObligatorio() {
        System.out.println("esObligatorio");
        Component cm = null;
        boolean opcion = false;
        boolean expResult = false;
        boolean result = ECampos.esObligatorio(cm, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
