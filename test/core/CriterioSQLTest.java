/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

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
public class CriterioSQLTest {
    
    public CriterioSQLTest() {
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
     * Test of getValores method, of class CriterioSQL.
     */
    @Test
    public void testGetValores() {
        System.out.println("getValores");
        CriterioSQL instance = new CriterioSQL();
        Object[] expResult = null;
        Object[] result = instance.getValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCondicion method, of class CriterioSQL.
     */
    @Test
    public void testGetCondicion() {
        System.out.println("getCondicion");
        CriterioSQL instance = new CriterioSQL();
        List<CriterioSQL.Condicion> expResult = null;
        List<CriterioSQL.Condicion> result = instance.getCondicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUpdatePreparement method, of class CriterioSQL.
     */
    @Test
    public void testIsUpdatePreparement() {
        System.out.println("isUpdatePreparement");
        CriterioSQL instance = new CriterioSQL();
        boolean expResult = false;
        boolean result = instance.isUpdatePreparement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdatePreparement method, of class CriterioSQL.
     */
    @Test
    public void testSetUpdatePreparement() {
        System.out.println("setUpdatePreparement");
        boolean updatePreparement = false;
        CriterioSQL instance = new CriterioSQL();
        instance.setUpdatePreparement(updatePreparement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabla method, of class CriterioSQL.
     */
    @Test
    public void testGetTabla() {
        System.out.println("getTabla");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getTabla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTabla method, of class CriterioSQL.
     */
    @Test
    public void testSetTabla() {
        System.out.println("setTabla");
        String tabla = "";
        CriterioSQL instance = new CriterioSQL();
        instance.setTabla(tabla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelect method, of class CriterioSQL.
     */
    @Test
    public void testSetSelect_String() {
        System.out.println("setSelect");
        String campos = "";
        CriterioSQL instance = new CriterioSQL();
        instance.setSelect(campos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelect method, of class CriterioSQL.
     */
    @Test
    public void testSetSelect_StringArr() {
        System.out.println("setSelect");
        String[] campos = null;
        CriterioSQL instance = new CriterioSQL();
        instance.setSelect(campos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSelect method, of class CriterioSQL.
     */
    @Test
    public void testAddSelect() {
        System.out.println("addSelect");
        String campo = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addSelect(campo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondicion method, of class CriterioSQL.
     */
    @Test
    public void testAddCondicion_String_Number() {
        System.out.println("addCondicion");
        String campo = "";
        Number value = null;
        CriterioSQL instance = new CriterioSQL();
        instance.addCondicion(campo, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondicion method, of class CriterioSQL.
     */
    @Test
    public void testAddCondicion_String_String() {
        System.out.println("addCondicion");
        String campo = "";
        String value = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCondicion(campo, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondicionUpdate method, of class CriterioSQL.
     */
    @Test
    public void testAddCondicionUpdate() {
        System.out.println("addCondicionUpdate");
        String campo = "";
        Object value = null;
        String operadorlogico = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCondicionUpdate(campo, value, operadorlogico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondicion method, of class CriterioSQL.
     */
    @Test
    public void testAddCondicion_3args() {
        System.out.println("addCondicion");
        String campo = "";
        Object value = null;
        String operadorComparacion = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCondicion(campo, value, operadorComparacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agruparPor method, of class CriterioSQL.
     */
    @Test
    public void testAgruparPor_ObjectArr() {
        System.out.println("agruparPor");
        Object[] valores = null;
        CriterioSQL instance = new CriterioSQL();
        instance.agruparPor(valores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agruparPor method, of class CriterioSQL.
     */
    @Test
    public void testAgruparPor_Object() {
        System.out.println("agruparPor");
        Object valor = null;
        CriterioSQL instance = new CriterioSQL();
        instance.agruparPor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agruparPor method, of class CriterioSQL.
     */
    @Test
    public void testAgruparPor_StringArr() {
        System.out.println("agruparPor");
        String[] campos = null;
        CriterioSQL instance = new CriterioSQL();
        instance.agruparPor(campos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agruparPor method, of class CriterioSQL.
     */
    @Test
    public void testAgruparPor_String() {
        System.out.println("agruparPor");
        String campo = "";
        CriterioSQL instance = new CriterioSQL();
        instance.agruparPor(campo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queTengan method, of class CriterioSQL.
     */
    @Test
    public void testQueTengan_4args_1() {
        System.out.println("queTengan");
        String funcion = "";
        String campo = "";
        String comparacion = "";
        Number valor = null;
        CriterioSQL instance = new CriterioSQL();
        instance.queTengan(funcion, campo, comparacion, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of queTengan method, of class CriterioSQL.
     */
    @Test
    public void testQueTengan_4args_2() {
        System.out.println("queTengan");
        String funcion = "";
        String campo = "";
        String comparacion = "";
        String valor = "";
        CriterioSQL instance = new CriterioSQL();
        instance.queTengan(funcion, campo, comparacion, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCondicion method, of class CriterioSQL.
     */
    @Test
    public void testAddCondicion_4args() {
        System.out.println("addCondicion");
        String campo = "";
        Object value = null;
        String operadorComparacion = "";
        String operadorBoleano = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCondicion(campo, value, operadorComparacion, operadorBoleano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTexto method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTexto_String_String() {
        System.out.println("addCompareTexto");
        String campo = "";
        String value = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTexto(campo, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTexto method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTexto_3args() {
        System.out.println("addCompareTexto");
        String campo = "";
        String value = "";
        String operadorLogico = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTexto(campo, value, operadorLogico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTexto method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTexto_4args() {
        System.out.println("addCompareTexto");
        String campo = "";
        String value = "";
        String operadorLogico = "";
        String operadorDeComparacion = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTexto(campo, value, operadorLogico, operadorDeComparacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTextoEmpiezaCon method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTextoEmpiezaCon() {
        System.out.println("addCompareTextoEmpiezaCon");
        String campo = "";
        String value = "";
        String comodin = "";
        String operadorLogico = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTextoEmpiezaCon(campo, value, comodin, operadorLogico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTextoTerminaCon method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTextoTerminaCon() {
        System.out.println("addCompareTextoTerminaCon");
        String campo = "";
        String value = "";
        String comodin = "";
        String operadorLogico = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTextoTerminaCon(campo, value, comodin, operadorLogico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareTextoInicioFinal method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareTextoInicioFinal() {
        System.out.println("addCompareTextoInicioFinal");
        String campo = "";
        String value = "";
        String comodinInicial = "";
        String comodinFinal = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareTextoInicioFinal(campo, value, comodinInicial, comodinFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistinct method, of class CriterioSQL.
     */
    @Test
    public void testSetDistinct() {
        System.out.println("setDistinct");
        boolean establecer = false;
        CriterioSQL instance = new CriterioSQL();
        instance.setDistinct(establecer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareValorBetween method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareValorBetween() {
        System.out.println("addCompareValorBetween");
        String campo = "";
        Object valorInical = null;
        Object valorFinal = null;
        String operadorBooleano = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareValorBetween(campo, valorInical, valorFinal, operadorBooleano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompareValorIn method, of class CriterioSQL.
     */
    @Test
    public void testAddCompareValorIn() {
        System.out.println("addCompareValorIn");
        String campo = "";
        Object[] valores = null;
        String operadorBooleano = "";
        CriterioSQL instance = new CriterioSQL();
        instance.addCompareValorIn(campo, valores, operadorBooleano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrden method, of class CriterioSQL.
     */
    @Test
    public void testSetOrden() {
        System.out.println("setOrden");
        String campo = "";
        String tipoOrden = "";
        CriterioSQL instance = new CriterioSQL();
        instance.setOrden(campo, tipoOrden);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimit method, of class CriterioSQL.
     */
    @Test
    public void testSetLimit() {
        System.out.println("setLimit");
        int limit = 0;
        CriterioSQL instance = new CriterioSQL();
        instance.setLimit(limit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesplazamientos method, of class CriterioSQL.
     */
    @Test
    public void testSetDesplazamientos() {
        System.out.println("setDesplazamientos");
        int offset = 0;
        CriterioSQL instance = new CriterioSQL();
        instance.setDesplazamientos(offset);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSQLnativo method, of class CriterioSQL.
     */
    @Test
    public void testSetSQLnativo() {
        System.out.println("setSQLnativo");
        String sql = "";
        CriterioSQL instance = new CriterioSQL();
        instance.setSQLnativo(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlias method, of class CriterioSQL.
     */
    @Test
    public void testGetAlias() {
        System.out.println("getAlias");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getAlias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlias method, of class CriterioSQL.
     */
    @Test
    public void testSetAlias() {
        System.out.println("setAlias");
        String alias = "";
        CriterioSQL instance = new CriterioSQL();
        instance.setAlias(alias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCondicion method, of class CriterioSQL.
     */
    @Test
    public void testSetCondicion() {
        System.out.println("setCondicion");
        List<CriterioSQL.Condicion> condicion = null;
        CriterioSQL instance = new CriterioSQL();
        instance.setCondicion(condicion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsultaSQL method, of class CriterioSQL.
     */
    @Test
    public void testGetConsultaSQL() {
        System.out.println("getConsultaSQL");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getConsultaSQL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSQLfromWhere method, of class CriterioSQL.
     */
    @Test
    public void testGetSQLfromWhere() {
        System.out.println("getSQLfromWhere");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getSQLfromWhere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOnlyWhere method, of class CriterioSQL.
     */
    @Test
    public void testGetOnlyWhere() {
        System.out.println("getOnlyWhere");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getOnlyWhere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSQLupdate method, of class CriterioSQL.
     */
    @Test
    public void testGetSQLupdate() {
        System.out.println("getSQLupdate");
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getSQLupdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unirCon method, of class CriterioSQL.
     */
    @Test
    public void testUnirCon() {
        System.out.println("unirCon");
        Object[] valores = null;
        String separador = "";
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.unirCon(valores, separador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esNumero method, of class CriterioSQL.
     */
    @Test
    public void testEsNumero() {
        System.out.println("esNumero");
        Object valor = null;
        CriterioSQL instance = new CriterioSQL();
        Number expResult = null;
        Number result = instance.esNumero(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringFromArray method, of class CriterioSQL.
     */
    @Test
    public void testGetStringFromArray() {
        System.out.println("getStringFromArray");
        String[] campos = null;
        CriterioSQL instance = new CriterioSQL();
        String expResult = "";
        String result = instance.getStringFromArray(campos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
