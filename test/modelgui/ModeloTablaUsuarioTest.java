/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelgui;

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
public class ModeloTablaUsuarioTest {
    
    public ModeloTablaUsuarioTest() {
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
     * Test of getCantidadRegistros method, of class ModeloTablaUsuario.
     */
    @Test
    public void testGetCantidadRegistros() {
        System.out.println("getCantidadRegistros");
        ModeloTablaUsuario instance = new ModeloTablaUsuario();
        int expResult = 0;
        int result = instance.getCantidadRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class ModeloTablaUsuario.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaUsuario instance = new ModeloTablaUsuario();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
