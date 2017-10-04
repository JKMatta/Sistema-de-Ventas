/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import javax.swing.JTable;
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
public class CeldaAccionEditorTest {
    
    public CeldaAccionEditorTest() {
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
     * Test of getCellEditorValue method, of class CeldaAccionEditor.
     */
    @Test
    public void testGetCellEditorValue() {
        System.out.println("getCellEditorValue");
        CeldaAccionEditor instance = null;
        Object expResult = null;
        Object result = instance.getCellEditorValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableCellEditorComponent method, of class CeldaAccionEditor.
     */
    @Test
    public void testGetTableCellEditorComponent() {
        System.out.println("getTableCellEditorComponent");
        JTable table = null;
        Object value = null;
        boolean isSelected = false;
        int row = 0;
        int column = 0;
        CeldaAccionEditor instance = null;
        Component expResult = null;
        Component result = instance.getTableCellEditorComponent(table, value, isSelected, row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lanzarDetencionEdicion method, of class CeldaAccionEditor.
     */
    @Test
    public void testLanzarDetencionEdicion() {
        System.out.println("lanzarDetencionEdicion");
        CeldaAccionEditor instance = null;
        instance.lanzarDetencionEdicion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
