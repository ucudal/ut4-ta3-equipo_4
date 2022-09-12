/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jtaba
 */
public class TArbolBBTest {

    public TArbolBBTest() {
    }

    /**
     * Test of insertar method, of class TArbolBB.
     */
//    @Test
//    public void testInsertar() {
//        System.out.println("insertar");
//        TArbolBB instance = new TArbolBB();
//        boolean expResult = false;
//        boolean result = instance.insertar(null);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscar method, of class TArbolBB.
//     */
//    @Test
//    public void testBuscar() {
//        System.out.println("buscar");
//        Comparable unaEtiqueta = null;
//        TArbolBB instance = new TArbolBB();
//        TElementoAB expResult = null;
//        TElementoAB result = instance.buscar(unaEtiqueta);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of inOrden method, of class TArbolBB.
//     */
//    @Test
//    public void testInOrden() {
//        System.out.println("inOrden");
//        TArbolBB instance = new TArbolBB();
//        String expResult = "";
//        String result = instance.inOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of esVacio method, of class TArbolBB.
//     */
//    @Test
//    public void testEsVacio() {
//        System.out.println("esVacio");
//        TArbolBB instance = new TArbolBB();
//        boolean expResult = false;
//        boolean result = instance.esVacio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of vaciar method, of class TArbolBB.
//     */
//    @Test
//    public void testVaciar() {
//        System.out.println("vaciar");
//        TArbolBB instance = new TArbolBB();
//        boolean expResult = false;
//        boolean result = instance.vaciar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of inorden method, of class TArbolBB.
//     */
//    @Test
//    public void testInorden() {
//        System.out.println("inorden");
//        TArbolBB instance = new TArbolBB();
//        Lista expResult = null;
//        Lista result = instance.inorden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of obtenerAltura method, of class TArbolBB.
     */
    @Test
    public void testObtenerAlturaArbolVacio() {
        TArbolBB instance = new TArbolBB();
        int expResult = -1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConUnNodo() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem = new TElementoAB(5, 5);
        instance.insertar(elem);
        int expResult = 0;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConDosNodos1() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(5, 5);
        TElementoAB elem2 = new TElementoAB(7, 7);
        instance.insertar(elem1);
        instance.insertar(elem2);
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConDosNodos2() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(7, 7);
        TElementoAB elem2 = new TElementoAB(5, 5);
        instance.insertar(elem1);
        instance.insertar(elem2);
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConTresNodos1() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(7, 7);
        TElementoAB elem2 = new TElementoAB(5, 5);
        TElementoAB elem3 = new TElementoAB(4, 4);

        instance.insertar(elem1);
        instance.insertar(elem2);
        instance.insertar(elem3);
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConTresNodos2() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(7, 7);
        TElementoAB elem2 = new TElementoAB(5, 5);
        TElementoAB elem3 = new TElementoAB(6, 6);

        instance.insertar(elem1);
        instance.insertar(elem2);
        instance.insertar(elem3);
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConTresNodos3() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(5, 5);
        TElementoAB elem2 = new TElementoAB(7, 7);
        TElementoAB elem3 = new TElementoAB(8, 8);

        instance.insertar(elem1);
        instance.insertar(elem2);
        instance.insertar(elem3);
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConTresNodos4() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(7, 7);
        TElementoAB elem2 = new TElementoAB(5, 5);
        TElementoAB elem3 = new TElementoAB(6, 6);

        instance.insertar(elem1);
        instance.insertar(elem2);
        instance.insertar(elem3);
        int expResult = 2;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolConTresNodos5() {
        TArbolBB instance = new TArbolBB();
        TElementoAB elem1 = new TElementoAB(7, 7);
        TElementoAB elem2 = new TElementoAB(5, 5);
        TElementoAB elem3 = new TElementoAB(9, 9);

        instance.insertar(elem1);
        instance.insertar(elem2);
        instance.insertar(elem3);
        int expResult = 1;
        int result = instance.obtenerAltura();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerTamanio method, of class TArbolBB.
     */
//    @Test
//    public void testObtenerTamanio() {
//        System.out.println("obtenerTamanio");
//        TArbolBB instance = new TArbolBB();
//        int expResult = 0;
//        int result = instance.obtenerTamanio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerNivel method, of class TArbolBB.
//     */
//    @Test
//    public void testObtenerNivel() {
//        System.out.println("obtenerNivel");
//        Comparable unaEtiqueta = null;
//        TArbolBB instance = new TArbolBB();
//        int expResult = 0;
//        int result = instance.obtenerNivel(unaEtiqueta);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerCantidadHojas method, of class TArbolBB.
//     */
//    @Test
//    public void testObtenerCantidadHojas() {
//        System.out.println("obtenerCantidadHojas");
//        TArbolBB instance = new TArbolBB();
//        int expResult = 0;
//        int result = instance.obtenerCantidadHojas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
