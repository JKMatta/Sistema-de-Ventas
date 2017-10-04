/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigolite;

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
public class EncriptadorPasswordTest {
    
    public EncriptadorPasswordTest() {
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
     * Test of encrypt method, of class EncriptadorPassword.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String str = "";
        EncriptadorPassword instance = null;
        String expResult = "";
        String result = instance.encrypt(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class EncriptadorPassword.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String str = "";
        EncriptadorPassword instance = null;
        String expResult = "";
        String result = instance.decrypt(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
