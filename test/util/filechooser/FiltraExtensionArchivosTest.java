/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.filechooser;

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
public class FiltraExtensionArchivosTest {
    
    public FiltraExtensionArchivosTest() {
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
     * Test of accept method, of class FiltraExtensionArchivos.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        File f = null;
        FiltraExtensionArchivos instance = new FiltraExtensionArchivos();
        boolean expResult = false;
        boolean result = instance.accept(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class FiltraExtensionArchivos.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        FiltraExtensionArchivos instance = new FiltraExtensionArchivos();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
