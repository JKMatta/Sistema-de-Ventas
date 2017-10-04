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
public class ModeloTablaProveedorTest {
    
    public ModeloTablaProveedorTest() {
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
     * Test of getCantidadRegistros method, of class ModeloTablaProveedor.
     */
    @Test
    public void testGetCantidadRegistros() {
        System.out.println("getCantidadRegistros");
        ModeloTablaProveedor instance = new ModeloTablaProveedor();
        int expResult = 0;
        int result = instance.getCantidadRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cmpRuc method, of class ModeloTablaProveedor.
     */
    @Test
    public void testCmpRuc() {
        System.out.println("cmpRuc");
        String expResult = "";
        String result = ModeloTablaProveedor.cmpRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cmpRazonSocial method, of class ModeloTablaProveedor.
     */
    @Test
    public void testCmpRazonSocial() {
        System.out.println("cmpRazonSocial");
        String expResult = "";
        String result = ModeloTablaProveedor.cmpRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cmpTelefono method, of class ModeloTablaProveedor.
     */
    @Test
    public void testCmpTelefono() {
        System.out.println("cmpTelefono");
        String expResult = "";
        String result = ModeloTablaProveedor.cmpTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cmpActivo method, of class ModeloTablaProveedor.
     */
    @Test
    public void testCmpActivo() {
        System.out.println("cmpActivo");
        String expResult = "";
        String result = ModeloTablaProveedor.cmpActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class ModeloTablaProveedor.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        ModeloTablaProveedor instance = new ModeloTablaProveedor();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class ModeloTablaProveedor.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaProveedor instance = new ModeloTablaProveedor();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
