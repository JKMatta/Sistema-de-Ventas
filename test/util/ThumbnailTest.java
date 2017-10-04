/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
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
public class ThumbnailTest {
    
    public ThumbnailTest() {
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
     * Test of resize method, of class Thumbnail.
     */
    @Test
    public void testResize() throws Exception {
        System.out.println("resize");
        Thumbnail instance = null;
        instance.resize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarThumbnail method, of class Thumbnail.
     */
    @Test
    public void testGenerarThumbnail() {
        System.out.println("generarThumbnail");
        Thumbnail instance = null;
        FileInputStream expResult = null;
        FileInputStream result = instance.generarThumbnail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalidad method, of class Thumbnail.
     */
    @Test
    public void testGetCalidad() {
        System.out.println("getCalidad");
        Thumbnail instance = null;
        int expResult = 0;
        int result = instance.getCalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalidad method, of class Thumbnail.
     */
    @Test
    public void testSetCalidad() {
        System.out.println("setCalidad");
        int calidad = 0;
        Thumbnail instance = null;
        instance.setCalidad(calidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Thumbnail.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Thumbnail instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Thumbnail.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        Thumbnail instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImgOriginal method, of class Thumbnail.
     */
    @Test
    public void testGetImgOriginal() {
        System.out.println("getImgOriginal");
        Thumbnail instance = null;
        String expResult = "";
        String result = instance.getImgOriginal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImgOriginal method, of class Thumbnail.
     */
    @Test
    public void testSetImgOriginal() {
        System.out.println("setImgOriginal");
        String imgOriginal = "";
        Thumbnail instance = null;
        instance.setImgOriginal(imgOriginal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImgResult method, of class Thumbnail.
     */
    @Test
    public void testGetImgResult() {
        System.out.println("getImgResult");
        Thumbnail instance = null;
        String expResult = "";
        String result = instance.getImgResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImgResult method, of class Thumbnail.
     */
    @Test
    public void testSetImgResult() {
        System.out.println("setImgResult");
        String imgResult = "";
        Thumbnail instance = null;
        instance.setImgResult(imgResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Thumbnail.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Thumbnail instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Thumbnail.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        Thumbnail instance = null;
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
