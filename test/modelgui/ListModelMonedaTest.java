/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelgui;

import modelbd.Moneda;
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
public class ListModelMonedaTest {
    
    public ListModelMonedaTest() {
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
     * Test of getPredeterminado method, of class ListModelMoneda.
     */
    @Test
    public void testGetPredeterminado() {
        System.out.println("getPredeterminado");
        ListModelMoneda instance = new ListModelMoneda();
        Moneda expResult = null;
        Moneda result = instance.getPredeterminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
