/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.ArrayList;
import modelbd.Almacen;
import modelbd.Moneda;
import modelbd.Usuario;
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
public class AppConfigTest {
    
    public AppConfigTest() {
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
     * Test of configUsuario method, of class AppConfig.
     */
    @Test
    public void testConfigUsuario() {
        System.out.println("configUsuario");
        String login = "";
        String clave = "";
        AppConfig.Estado expResult = null;
        AppConfig.Estado result = AppConfig.configUsuario(login, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class AppConfig.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario expResult = null;
        Usuario result = AppConfig.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class AppConfig.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        AppConfig.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlmacen method, of class AppConfig.
     */
    @Test
    public void testGetAlmacen() {
        System.out.println("getAlmacen");
        Almacen expResult = null;
        Almacen result = AppConfig.getAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlmacen method, of class AppConfig.
     */
    @Test
    public void testSetAlmacen() {
        System.out.println("setAlmacen");
        Almacen almacen = null;
        AppConfig.setAlmacen(almacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoneda method, of class AppConfig.
     */
    @Test
    public void testGetMoneda() {
        System.out.println("getMoneda");
        Moneda expResult = null;
        Moneda result = AppConfig.getMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoneda method, of class AppConfig.
     */
    @Test
    public void testSetMoneda() {
        System.out.println("setMoneda");
        Moneda moneda = null;
        AppConfig.setMoneda(moneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlmacenes method, of class AppConfig.
     */
    @Test
    public void testGetAlmacenes() {
        System.out.println("getAlmacenes");
        ArrayList<Almacen> expResult = null;
        ArrayList<Almacen> result = AppConfig.getAlmacenes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlmacenes method, of class AppConfig.
     */
    @Test
    public void testSetAlmacenes() {
        System.out.println("setAlmacenes");
        ArrayList<Almacen> almacenes = null;
        AppConfig.setAlmacenes(almacenes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
