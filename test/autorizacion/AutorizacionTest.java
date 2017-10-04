/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorizacion;

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
public class AutorizacionTest {
    
    public AutorizacionTest() {
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
     * Test of checkAccess method, of class Autorizacion.
     */
    @Test
    public void testCheckAccess() {
        System.out.println("checkAccess");
        String itemName = "";
        HashMap params = null;
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.checkAccess(itemName, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthManager method, of class Autorizacion.
     */
    @Test
    public void testGetAuthManager() {
        System.out.println("getAuthManager");
        Autorizacion instance = null;
        IAuthManager expResult = null;
        IAuthManager result = instance.getAuthManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Autorizacion.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Autorizacion instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Autorizacion.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Autorizacion instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Autorizacion.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String value = "";
        Autorizacion instance = null;
        instance.setName(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Autorizacion.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Autorizacion instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Autorizacion.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String value = "";
        Autorizacion instance = null;
        instance.setDescription(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBizRule method, of class Autorizacion.
     */
    @Test
    public void testGetBizRule() {
        System.out.println("getBizRule");
        Autorizacion instance = null;
        String expResult = "";
        String result = instance.getBizRule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBizRule method, of class Autorizacion.
     */
    @Test
    public void testSetBizRule() {
        System.out.println("setBizRule");
        String value = "";
        Autorizacion instance = null;
        instance.setBizRule(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Autorizacion.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Autorizacion instance = null;
        List<Autorizacion> expResult = null;
        List<Autorizacion> result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Autorizacion.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Autorizacion> value = null;
        Autorizacion instance = null;
        instance.setData(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChild method, of class Autorizacion.
     */
    @Test
    public void testAddChild() {
        System.out.println("addChild");
        String name = "";
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.addChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeChild method, of class Autorizacion.
     */
    @Test
    public void testRemoveChild() {
        System.out.println("removeChild");
        String name = "";
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.removeChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasChild method, of class Autorizacion.
     */
    @Test
    public void testHasChild() {
        System.out.println("hasChild");
        String name = "";
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.hasChild(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildren method, of class Autorizacion.
     */
    @Test
    public void testGetChildren() {
        System.out.println("getChildren");
        Autorizacion instance = null;
        List<Autorizacion> expResult = null;
        List<Autorizacion> result = instance.getChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class Autorizacion.
     */
    @Test
    public void testAssign_3args() {
        System.out.println("assign");
        Object userId = null;
        String bizRule = "";
        String data = "";
        Autorizacion instance = null;
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(userId, bizRule, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class Autorizacion.
     */
    @Test
    public void testAssign_Object_String() {
        System.out.println("assign");
        Object userId = null;
        String bizRule = "";
        Autorizacion instance = null;
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(userId, bizRule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assign method, of class Autorizacion.
     */
    @Test
    public void testAssign_Object() {
        System.out.println("assign");
        Object userId = null;
        Autorizacion instance = null;
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.assign(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revoke method, of class Autorizacion.
     */
    @Test
    public void testRevoke() {
        System.out.println("revoke");
        Object userId = null;
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.revoke(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAssigned method, of class Autorizacion.
     */
    @Test
    public void testIsAssigned() {
        System.out.println("isAssigned");
        Object userId = null;
        Autorizacion instance = null;
        boolean expResult = false;
        boolean result = instance.isAssigned(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssignment method, of class Autorizacion.
     */
    @Test
    public void testGetAssignment() {
        System.out.println("getAssignment");
        Object userId = null;
        Autorizacion instance = null;
        AutorizacionAsignado expResult = null;
        AutorizacionAsignado result = instance.getAssignment(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
