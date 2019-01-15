/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SolverTest {

    public SolverTest() {
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
     * Test of solve method, of class Solver.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        boolean writeOutputToFile = true;
        String input = "2, 3, 4, 5";
        Solver instance = new Solver();
        String output = instance.solve(input);
        String expected = "5";
        assertEquals(expected, output);
        // list in list
        input = "2 3 4 6";
        output = instance.solve(input);
        expected = "3";
        assertEquals(expected, output);

        
        String inputFileName = "/in.txt", outputFileName = "/out.txt";
        System.out.println(String.format("Read from file: %s", inputFileName));
        System.out.println("Compare result: ");
        System.out.println("**** ");
        int cnt = 0;
        String[] outputString = output.split("\n");
        try {
            BufferedReader br = new BufferedReader(new FileReader("/in.txt"));
            String line;
            while ((line = br.readLine()) != null){
                if (line != outputString[cnt]) {
                    fail("Test failed! wrong in line " + cnt);
                }
                cnt++;
            }
            assert (true);
        } catch (IOException ex) {
            Logger.getLogger(SolverTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (writeOutputToFile) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
                for (String s: outputString) {
                    bw.write(s);
                }
                bw.flush();
                bw.close();
                System.out.println("ok write done to file" + outputFileName);
            } catch (IOException ex) {
                Logger.getLogger(SolverTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
