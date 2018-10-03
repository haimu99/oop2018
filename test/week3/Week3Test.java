/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Minh1082QN
 */
public class Week3Test {
    
    public Week3Test() {
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
     * Test of max method, of class Week3.
     */
    @Test
    public void testMax1() {
        System.out.println("test max1");
        int m = -5;
        int n = -3;
        int expResult = -3;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax2() {
        System.out.println("test max2");
        int m = -5;
        int n = 0;
        int expResult = 0;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax3() {
        System.out.println("test max3");
        int m = -5;
        int n = 7;
        int expResult = 7;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax4() {
        System.out.println("test max4");
        int m = 0;
        int n = 4;
        int expResult =4;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax5() {
        System.out.println("test max5");
        int m = 3;
        int n = 9;
        int expResult = 9;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    /**
     * Test of minOfArray method, of class Week3.
     */
    @Test
    public void testMinOfArray1() {
        System.out.println("test minOfArray1");
        int[] array = new int[3];
        array[0]=-15;
        array[1]=-20;
        array[2]=6;
        int expResult = -20;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    @Test
    public void testMinOfArray2() {
        System.out.println("test minOfArray2");
        int[] array = new int[3];
        array[0]=-3;
        array[1]=9;
        array[2]=-10;
        int expResult = -10;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    @Test
    public void testMinOfArray3() {
        System.out.println("test minOfArray3");
        int[] array = new int[3];
        array[0]=-3;
        array[1]=0;
        array[2]=5;
        int expResult = -3;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
@Test
    public void testMinOfArray4() {
        System.out.println("test minOfArray4");
        int[] array = new int[3];
        array[0]=6;
        array[1]=0;
        array[2]=15;
        int expResult = 0;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }   
    @Test
    public void testMinOfArray5() {
        System.out.println("test minOfArray5");
        int[] array = new int[3];
        array[0]=5;
        array[1]=9;
        array[2]=9;
        int expResult = 5;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI() {
        System.out.println("calculateBMI");
        double weight = 80;
        double height = 1.78;
        String expResult = "Béo phì";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }
    
}
