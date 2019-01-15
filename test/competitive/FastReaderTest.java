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
public class FastReaderTest {
    
    public FastReaderTest() {
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
     * Test of next method, of class FastReader.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        FastReader instance = new FastReader();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextInt method, of class FastReader.
     */
    @Test
    public void testNextInt() {
        System.out.println("nextInt");
        FastReader instance = new FastReader();
        int expResult = 0;
        int result = instance.nextInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextLong method, of class FastReader.
     */
    @Test
    public void testNextLong() {
        System.out.println("nextLong");
        FastReader instance = new FastReader();
        long expResult = 0L;
        long result = instance.nextLong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextDouble method, of class FastReader.
     */
    @Test
    public void testNextDouble() {
        System.out.println("nextDouble");
        FastReader instance = new FastReader();
        double expResult = 0.0;
        double result = instance.nextDouble();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextLine method, of class FastReader.
     */
    @Test
    public void testNextLine() {
        System.out.println("nextLine");
        FastReader instance = new FastReader();
        String expResult = "";
        String result = instance.nextLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
