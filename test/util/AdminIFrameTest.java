/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
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
public class AdminIFrameTest {
    
    public AdminIFrameTest() {
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
     * Test of mostrarVentanaFactura method, of class AdminIFrame.
     */
    @Test
    public void testMostrarVentanaFactura() {
        System.out.println("mostrarVentanaFactura");
        JDesktopPane dp = null;
        JInternalFrame vnt = null;
        AdminIFrame.mostrarVentanaFactura(dp, vnt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
