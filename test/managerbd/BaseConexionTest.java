/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerbd;

import core.CriterioSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class BaseConexionTest {
    
    public BaseConexionTest() {
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
     * Test of init method, of class BaseConexion.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        BaseConexion.init();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConexion method, of class BaseConexion.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Connection expResult = null;
        Connection result = BaseConexion.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResultSet method, of class BaseConexion.
     */
    @Test
    public void testGetResultSet() {
        System.out.println("getResultSet");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = BaseConexion.getResultSet(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class BaseConexion.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        CriterioSQL sql = null;
        List<String> expResult = null;
        List<String> result = BaseConexion.getLista(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class BaseConexion.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        CriterioSQL sql = null;
        HashMap expResult = null;
        HashMap result = BaseConexion.getItems(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getItemChildrens method, of class BaseConexion.
     */
    @Test
    public void testGetItemChildrens() {
        System.out.println("getItemChildrens");
        String sql = "";
        ArrayList<HashMap> expResult = null;
        ArrayList<HashMap> result = BaseConexion.getItemChildrens(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStatement method, of class BaseConexion.
     */
    @Test
    public void testGetStatement() {
        System.out.println("getStatement");
        Statement expResult = null;
        Statement result = BaseConexion.getStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPreparedStatement method, of class BaseConexion.
     */
    @Test
    public void testGetPreparedStatement() {
        System.out.println("getPreparedStatement");
        String sql = "";
        PreparedStatement expResult = null;
        PreparedStatement result = BaseConexion.getPreparedStatement(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarEnlacesConexion method, of class BaseConexion.
     */
    @Test
    public void testCerrarEnlacesConexion() {
        System.out.println("cerrarEnlacesConexion");
        int tipoCierre = 0;
        BaseConexion.cerrarEnlacesConexion(tipoCierre);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
