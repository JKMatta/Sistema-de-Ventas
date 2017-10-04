/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;
import javax.swing.JTable;
import javax.swing.text.Document;
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
public class HelperTest {
    
    public HelperTest() {
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
     * Test of getFechaFormateada method, of class Helper.
     */
    @Test
    public void testGetFechaFormateada() {
        System.out.println("getFechaFormateada");
        Date fecha = null;
        int tipoFormato = 0;
        String expResult = "";
        String result = Helper.getFechaFormateada(fecha, tipoFormato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringToDate method, of class Helper.
     */
    @Test
    public void testStringToDate() {
        System.out.println("stringToDate");
        String text = "";
        Date expResult = null;
        Date result = Helper.stringToDate(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarCodigo method, of class Helper.
     */
    @Test
    public void testGenerarCodigo() {
        System.out.println("generarCodigo");
        String cadena = "";
        String prefijo = "";
        String expResult = "";
        String result = Helper.generarCodigo(cadena, prefijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiltraEntrada method, of class Helper.
     */
    @Test
    public void testSetFiltraEntrada() {
        System.out.println("setFiltraEntrada");
        Document dc = null;
        char tipoValidacion = ' ';
        int lgCadena = 0;
        boolean espcBlco = false;
        Helper.setFiltraEntrada(dc, tipoValidacion, lgCadena, espcBlco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerFiltraEntrada method, of class Helper.
     */
    @Test
    public void testRemoverFiltraEntrada() {
        System.out.println("removerFiltraEntrada");
        Document dc = null;
        Helper.removerFiltraEntrada(dc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajustarAnchoColumnas method, of class Helper.
     */
    @Test
    public void testAjustarAnchoColumnas() {
        System.out.println("ajustarAnchoColumnas");
        JTable table = null;
        Helper.ajustarAnchoColumnas(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
