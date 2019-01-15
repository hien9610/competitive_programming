/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hienphan
 */
public class FastScannerTest {
    
    public FastScannerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of next method, of class FastScanner.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        FastScanner instance = new FastScanner();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readLine method, of class FastScanner.
     */
    @Test
    public void testReadLine() {
        System.out.println("readLine");
        FastScanner instance = new FastScanner();
        String expResult = "";
        String result = instance.readLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInt method, of class FastScanner.
     */
    @Test
    public void testNextInt() {
        System.out.println("nextInt");
        FastScanner instance = new FastScanner();
        int expResult = 0;
        int result = instance.nextInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextLong method, of class FastScanner.
     */
    @Test
    public void testNextLong() {
        System.out.println("nextLong");
        FastScanner instance = new FastScanner();
        long expResult = 0L;
        long result = instance.nextLong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextDouble method, of class FastScanner.
     */
    @Test
    public void testNextDouble() {
        System.out.println("nextDouble");
        FastScanner instance = new FastScanner();
        double expResult = 0.0;
        double result = instance.nextDouble();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
