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
public class PaginadorTest {
    
    public PaginadorTest() {
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
     * Test of siguiente method, of class Paginador.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        Paginador instance = new Paginador();
        List<JAbstractModelBD> expResult = null;
        List<JAbstractModelBD> result = instance.siguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUltimo method, of class Paginador.
     */
    @Test
    public void testIsUltimo() {
        System.out.println("isUltimo");
        Paginador instance = new Paginador();
        boolean expResult = false;
        boolean result = instance.isUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anterior method, of class Paginador.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        Paginador instance = new Paginador();
        List<JAbstractModelBD> expResult = null;
        List<JAbstractModelBD> result = instance.anterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoObjeto method, of class Paginador.
     */
    @Test
    public void testGetTipoObjeto() {
        System.out.println("getTipoObjeto");
        Paginador instance = new Paginador();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getTipoObjeto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoObjeto method, of class Paginador.
     */
    @Test
    public void testSetTipoObjeto() {
        System.out.println("setTipoObjeto");
        JAbstractModelBD tipoObjeto = null;
        Paginador instance = new Paginador();
        instance.setTipoObjeto(tipoObjeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCriterio method, of class Paginador.
     */
    @Test
    public void testGetCriterio() {
        System.out.println("getCriterio");
        Paginador instance = new Paginador();
        CriterioSQL expResult = null;
        CriterioSQL result = instance.getCriterio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCriterio method, of class Paginador.
     */
    @Test
    public void testSetCriterio() {
        System.out.println("setCriterio");
        CriterioSQL criterio = null;
        Paginador instance = new Paginador();
        instance.setCriterio(criterio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Paginador.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Paginador instance = new Paginador();
        List<JAbstractModelBD> expResult = null;
        List<JAbstractModelBD> result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsPorPagina method, of class Paginador.
     */
    @Test
    public void testGetItemsPorPagina() {
        System.out.println("getItemsPorPagina");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getItemsPorPagina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemsPorPagina method, of class Paginador.
     */
    @Test
    public void testSetItemsPorPagina() {
        System.out.println("setItemsPorPagina");
        int itemsPorPagina = 0;
        Paginador instance = new Paginador();
        instance.setItemsPorPagina(itemsPorPagina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalItems method, of class Paginador.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getTotalItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalItems method, of class Paginador.
     */
    @Test
    public void testSetTotalItems() {
        System.out.println("setTotalItems");
        int totalItems = 0;
        Paginador instance = new Paginador();
        instance.setTotalItems(totalItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadesDePaginas method, of class Paginador.
     */
    @Test
    public void testGetCantidadesDePaginas() {
        System.out.println("getCantidadesDePaginas");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getCantidadesDePaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadesDePaginas method, of class Paginador.
     */
    @Test
    public void testSetCantidadesDePaginas() {
        System.out.println("setCantidadesDePaginas");
        int cantidadesDePaginas = 0;
        Paginador instance = new Paginador();
        instance.setCantidadesDePaginas(cantidadesDePaginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexpaginaActual method, of class Paginador.
     */
    @Test
    public void testGetIndexpaginaActual() {
        System.out.println("getIndexpaginaActual");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getIndexpaginaActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndexpaginaActual method, of class Paginador.
     */
    @Test
    public void testSetIndexpaginaActual() {
        System.out.println("setIndexpaginaActual");
        int IndexpaginaActual = 0;
        Paginador instance = new Paginador();
        instance.setIndexpaginaActual(IndexpaginaActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesplazamiento method, of class Paginador.
     */
    @Test
    public void testGetDesplazamiento() {
        System.out.println("getDesplazamiento");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getDesplazamiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesplazamiento method, of class Paginador.
     */
    @Test
    public void testSetDesplazamiento() {
        System.out.println("setDesplazamiento");
        int desplazamiento = 0;
        Paginador instance = new Paginador();
        instance.setDesplazamiento(desplazamiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLimite method, of class Paginador.
     */
    @Test
    public void testGetLimite() {
        System.out.println("getLimite");
        Paginador instance = new Paginador();
        int expResult = 0;
        int result = instance.getLimite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLimite method, of class Paginador.
     */
    @Test
    public void testSetLimite() {
        System.out.println("setLimite");
        int limite = 0;
        Paginador instance = new Paginador();
        instance.setLimite(limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
