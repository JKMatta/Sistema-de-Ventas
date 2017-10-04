/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.filechooser;

import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.io.File;
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
public class PanelVistaPreviaTest {
    
    public PanelVistaPreviaTest() {
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
     * Test of loadImage method, of class PanelVistaPrevia.
     */
    @Test
    public void testLoadImage() {
        System.out.println("loadImage");
        File f = null;
        PanelVistaPrevia instance = null;
        instance.loadImage(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class PanelVistaPrevia.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent e = null;
        PanelVistaPrevia instance = null;
        instance.propertyChange(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class PanelVistaPrevia.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        PanelVistaPrevia instance = null;
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
