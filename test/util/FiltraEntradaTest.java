/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;
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
public class FiltraEntradaTest {
    
    public FiltraEntradaTest() {
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
     * Test of insertString method, of class FiltraEntrada.
     */
    @Test
    public void testInsertString() throws Exception {
        System.out.println("insertString");
        DocumentFilter.FilterBypass fb = null;
        int offset = 0;
        String string = "";
        AttributeSet attr = null;
        FiltraEntrada instance = new FiltraEntrada();
        instance.insertString(fb, offset, string, attr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class FiltraEntrada.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        DocumentFilter.FilterBypass fb = null;
        int offset = 0;
        int length = 0;
        FiltraEntrada instance = new FiltraEntrada();
        instance.remove(fb, offset, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of replace method, of class FiltraEntrada.
     */
    @Test
    public void testReplace() throws Exception {
        System.out.println("replace");
        DocumentFilter.FilterBypass fb = null;
        int offset = 0;
        int length = 0;
        String text = "";
        AttributeSet attrs = null;
        FiltraEntrada instance = new FiltraEntrada();
        instance.replace(fb, offset, length, text, attrs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
