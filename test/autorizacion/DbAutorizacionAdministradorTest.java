/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorizacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import managerbd.BaseConexion;
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
public class DbAutorizacionAdministradorTest {
    
    public DbAutorizacionAdministradorTest() {
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
     * Test of getPermisosPorDefecto method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetPermisosPorDefecto() {
        System.out.println("getPermisosPorDefecto");
        HashMap expResult = null;
        HashMap result = DbAutorizacionAdministrador.getPermisosPorDefecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccess method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCheckAccess() {
        System.out.println("checkAccess");
        String itemName = "";
        Object userId = null;
        HashMap params = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.checkAccess(itemName, userId, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAccessRecursive method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCheckAccessRecursive() {
        System.out.println("checkAccessRecursive");
        String itemName = "";
        Object userId = null;
        HashMap params = null;
        List<AutorizacionAsignado> assignments = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.checkAccessRecursive(itemName, userId, params, assignments);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemChild method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testAddItemChild() {
        System.out.println("addItemChild");
        String itemName = "";
        String childName = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.addItemChild(itemName, childName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItemChild method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testRemoveItemChild() {
        System.out.println("removeItemChild");
        String itemName = "";
        String childName = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.removeItemChild(itemName, childName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasItemChild method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testHasItemChild() {
        System.out.println("hasItemChild");
        String itemName = "";
        String childName = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.hasItemChild(itemName, childName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemChildren method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetItemChildren() {
        System.out.println("getItemChildren");
        Object names = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        List<Autorizacion> expResult = null;
        List<Autorizacion> result = instance.getItemChildren(names);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testAssign_4args() {
        System.out.println("assign");
        String itemName = "";
        Object userId = null;
        String bizRule = "";
        Object data = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(itemName, userId, bizRule, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testAssign_3args() {
        System.out.println("assign");
        String itemName = "";
        Object userId = null;
        String bizRule = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(itemName, userId, bizRule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testAssign_String_Object() {
        System.out.println("assign");
        String itemName = "";
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(itemName, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revoke method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testRevoke() {
        System.out.println("revoke");
        String itemName = "";
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.revoke(itemName, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAssigned method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testIsAssigned() {
        System.out.println("isAssigned");
        String itemName = "";
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.isAssigned(itemName, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthAssignment method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthAssignment() {
        System.out.println("getAuthAssignment");
        String itemName = "";
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.getAuthAssignment(itemName, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthAssignments method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthAssignments() {
        System.out.println("getAuthAssignments");
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        ArrayList<AutorizacionAsignado> expResult = null;
        ArrayList<AutorizacionAsignado> result = instance.getAuthAssignments(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAuthAssignment method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testSaveAuthAssignment() {
        System.out.println("saveAuthAssignment");
        AutorizacionAsignado assignment = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.saveAuthAssignment(assignment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthItems method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthItems_Integer_Object() {
        System.out.println("getAuthItems");
        Integer type = null;
        Object userId = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        ArrayList<Autorizacion> expResult = null;
        ArrayList<Autorizacion> result = instance.getAuthItems(type, userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthItems method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthItems_int() {
        System.out.println("getAuthItems");
        int type = 0;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        ArrayList<Autorizacion> expResult = null;
        ArrayList<Autorizacion> result = instance.getAuthItems(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthItems method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthItems_0args() {
        System.out.println("getAuthItems");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        ArrayList<Autorizacion> expResult = null;
        ArrayList<Autorizacion> result = instance.getAuthItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCreateAuthItem_5args() {
        System.out.println("createAuthItem");
        String name = "";
        int type = 0;
        String description = "";
        String bizRule = "";
        Object data = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        Autorizacion expResult = null;
        Autorizacion result = instance.createAuthItem(name, type, description, bizRule, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCreateAuthItem_4args() {
        System.out.println("createAuthItem");
        String name = "";
        int type = 0;
        String description = "";
        String bizRule = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        Autorizacion expResult = null;
        Autorizacion result = instance.createAuthItem(name, type, description, bizRule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCreateAuthItem_3args() {
        System.out.println("createAuthItem");
        String name = "";
        int type = 0;
        String description = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        Autorizacion expResult = null;
        Autorizacion result = instance.createAuthItem(name, type, description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testCreateAuthItem_String_int() {
        System.out.println("createAuthItem");
        String name = "";
        int type = 0;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        Autorizacion expResult = null;
        Autorizacion result = instance.createAuthItem(name, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testRemoveAuthItem() {
        System.out.println("removeAuthItem");
        String name = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.removeAuthItem(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetAuthItem() {
        System.out.println("getAuthItem");
        String name = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        Autorizacion expResult = null;
        Autorizacion result = instance.getAuthItem(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testSaveAuthItem_Autorizacion_String() {
        System.out.println("saveAuthItem");
        Autorizacion item = null;
        String oldName = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.saveAuthItem(item, oldName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAuthItem method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testSaveAuthItem_Autorizacion() {
        System.out.println("saveAuthItem");
        Autorizacion item = null;
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.saveAuthItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearAll method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testClearAll() {
        System.out.println("clearAll");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.clearAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearAuthAssignments method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testClearAuthAssignments() {
        System.out.println("clearAuthAssignments");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        instance.clearAuthAssignments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of detectLoop method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testDetectLoop() {
        System.out.println("detectLoop");
        String itemName = "";
        String childName = "";
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.detectLoop(itemName, childName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbConnection method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testGetDbConnection() {
        System.out.println("getDbConnection");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        BaseConexion expResult = null;
        BaseConexion result = instance.getDbConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of usingSqlite method, of class DbAutorizacionAdministrador.
     */
    @Test
    public void testUsingSqlite() {
        System.out.println("usingSqlite");
        DbAutorizacionAdministrador instance = new DbAutorizacionAdministrador();
        boolean expResult = false;
        boolean result = instance.usingSqlite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
