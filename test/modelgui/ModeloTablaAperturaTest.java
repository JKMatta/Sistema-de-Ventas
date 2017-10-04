/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelgui;

import java.util.ArrayList;
import modelbd.AlmacenProducto;
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
public class ModeloTablaAperturaTest {
    
    public ModeloTablaAperturaTest() {
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
     * Test of getRowCount method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        ModeloTablaApertura instance = new ModeloTablaApertura();
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        ModeloTablaApertura instance = new ModeloTablaApertura();
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int column = 0;
        ModeloTablaApertura instance = new ModeloTablaApertura();
        String expResult = "";
        String result = instance.getColumnName(column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnClass method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        int columnIndex = 0;
        ModeloTablaApertura instance = new ModeloTablaApertura();
        Class expResult = null;
        Class result = instance.getColumnClass(columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellEditable method, of class ModeloTablaApertura.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaApertura instance = new ModeloTablaApertura();
        boolean expResult = false;
        boolean result = instance.isCellEditable(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValueAt method, of class ModeloTablaApertura.
     */
    @Test
    public void testSetValueAt() {
        System.out.println("setValueAt");
        Object aValue = null;
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaApertura instance = new ModeloTablaApertura();
        instance.setValueAt(aValue, rowIndex, columnIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalProductos method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetTotalProductos() {
        System.out.println("getTotalProductos");
        ModeloTablaApertura instance = new ModeloTablaApertura();
        Integer expResult = null;
        Integer result = instance.getTotalProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaApertura instance = new ModeloTablaApertura();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatos method, of class ModeloTablaApertura.
     */
    @Test
    public void testGetDatos() {
        System.out.println("getDatos");
        ModeloTablaApertura instance = new ModeloTablaApertura();
        ArrayList<AlmacenProducto> expResult = null;
        ArrayList<AlmacenProducto> result = instance.getDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
