/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelgui;

import java.util.ArrayList;
import modelbd.DetalleCompra;
import modelbd.Producto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ventanas.ICompra;

/**
 *
 * @author Wilmer Quito
 */
public class ModeloTablaDetalleCompraTest {
    
    public ModeloTablaDetalleCompraTest() {
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
     * Test of setCopiaEliminados method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testSetCopiaEliminados() {
        System.out.println("setCopiaEliminados");
        DetalleCompra detalleCompra = null;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.setCopiaEliminados(detalleCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarProductoDeEliminados method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testQuitarProductoDeEliminados() {
        System.out.println("quitarProductoDeEliminados");
        Producto prd = null;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.quitarProductoDeEliminados(prd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductosEliminados method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetProductosEliminados() {
        System.out.println("getProductosEliminados");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        ArrayList<DetalleCompra> expResult = null;
        ArrayList<DetalleCompra> result = instance.getProductosEliminados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnClass method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        int columnIndex = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        Class expResult = null;
        Class result = instance.getColumnClass(columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellEditable method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        boolean expResult = false;
        boolean result = instance.isCellEditable(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValueAt method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testSetValueAt_4args() {
        System.out.println("setValueAt");
        ICompra compra = null;
        Object aValue = null;
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.setValueAt(compra, aValue, rowIndex, columnIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValueAt method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testSetValueAt_3args() {
        System.out.println("setValueAt");
        Object aValue = null;
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.setValueAt(aValue, rowIndex, columnIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto prd = null;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.agregar(prd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remplazarProducto method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testRemplazarProducto() {
        System.out.println("remplazarProducto");
        Producto prd = null;
        int index = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.remplazarProducto(prd, index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarFila method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testQuitarFila() {
        System.out.println("quitarFila");
        int fila = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.quitarFila(fila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existe method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testExiste() {
        System.out.println("existe");
        Producto prd = null;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        boolean expResult = false;
        boolean result = instance.existe(prd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubTotal method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        Double expResult = null;
        Double result = instance.getSubTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarItems method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testContarItems() {
        System.out.println("contarItems");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.contarItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumItems method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetNumItems() {
        System.out.println("getNumItems");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        Integer expResult = null;
        Integer result = instance.getNumItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValueAt method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        Object expResult = null;
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallesCompra method, of class ModeloTablaDetalleCompra.
     */
    @Test
    public void testGetDetallesCompra() {
        System.out.println("getDetallesCompra");
        ModeloTablaDetalleCompra instance = new ModeloTablaDetalleCompra();
        ArrayList<DetalleCompra> expResult = null;
        ArrayList<DetalleCompra> result = instance.getDetallesCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
