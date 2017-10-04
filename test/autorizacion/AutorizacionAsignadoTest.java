/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorizacion;

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
public class AutorizacionAsignadoTest {
    
    public AutorizacionAsignadoTest() {
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
     * Test of getUserId method, of class AutorizacionAsignado.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        AutorizacionAsignado instance = null;
        Object expResult = null;
        Object result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemName method, of class AutorizacionAsignado.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        AutorizacionAsignado instance = null;
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBizRule method, of class AutorizacionAsignado.
     */
    @Test
    public void testGetBizRule() {
        System.out.println("getBizRule");
        AutorizacionAsignado instance = null;
        String expResult = "";
        String result = instance.getBizRule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBizRule method, of class AutorizacionAsignado.
     */
    @Test
    public void testSetBizRule() {
        System.out.println("setBizRule");
        String value = "";
        AutorizacionAsignado instance = null;
        instance.setBizRule(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class AutorizacionAsignado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        AutorizacionAsignado instance = null;
        List<Autorizacion> expResult = null;
        List<Autorizacion> result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class AutorizacionAsignado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        List<Autorizacion> value = null;
        AutorizacionAsignado instance = null;
        instance.setData(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AutorizacionAsignado.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AutorizacionAsignado instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AutorizacionAsignado.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AutorizacionAsignado instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
