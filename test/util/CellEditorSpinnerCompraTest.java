/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ventanas.ICompra;

/**
 *
 * @author Wilmer Quito
 */
public class CellEditorSpinnerCompraTest {
    
    public CellEditorSpinnerCompraTest() {
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
     * Test of getCellEditorValue method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetCellEditorValue() {
        System.out.println("getCellEditorValue");
        CellEditorSpinnerCompra instance = null;
        Object expResult = null;
        Object result = instance.getCellEditorValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableCellEditorComponent method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetTableCellEditorComponent() {
        System.out.println("getTableCellEditorComponent");
        JTable table = null;
        Object value = null;
        boolean isSelected = false;
        int row = 0;
        int column = 0;
        CellEditorSpinnerCompra instance = null;
        Component expResult = null;
        Component result = instance.getTableCellEditorComponent(table, value, isSelected, row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFila method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetFila() {
        System.out.println("getFila");
        CellEditorSpinnerCompra instance = null;
        int expResult = 0;
        int result = instance.getFila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumna method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetColumna() {
        System.out.println("getColumna");
        CellEditorSpinnerCompra instance = null;
        int expResult = 0;
        int result = instance.getColumna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompra method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetCompra() {
        System.out.println("getCompra");
        CellEditorSpinnerCompra instance = null;
        ICompra expResult = null;
        ICompra result = instance.getCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpinner method, of class CellEditorSpinnerCompra.
     */
    @Test
    public void testGetSpinner() {
        System.out.println("getSpinner");
        CellEditorSpinnerCompra instance = null;
        JSpinner expResult = null;
        JSpinner result = instance.getSpinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
