/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.filechooser;

import java.io.File;
import javax.swing.Icon;
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
public class VistaArchivosTest {
    
    public VistaArchivosTest() {
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
     * Test of getDescription method, of class VistaArchivos.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        File f = null;
        VistaArchivos instance = new VistaArchivos();
        String expResult = "";
        String result = instance.getDescription(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIcon method, of class VistaArchivos.
     */
    @Test
    public void testGetIcon() {
        System.out.println("getIcon");
        File f = null;
        VistaArchivos instance = new VistaArchivos();
        Icon expResult = null;
        Icon result = instance.getIcon(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
