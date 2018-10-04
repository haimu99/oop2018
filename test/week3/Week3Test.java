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
        assertEquals(-3, Week3.max(-5, -3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax2() {
        System.out.println("test max2");
        assertEquals(0, Week3.max(0,-5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax3(){
        System.out.println("test max3");
        assertEquals(7, Week3.max(-5, 7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax4() {
        System.out.println("test max4");
        assertEquals(4, Week3.max(0, 4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax5() {
        System.out.println("test max5");
        assertEquals(9, Week3.max(9, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); 
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI1() {
        System.out.println("calculateBMI1");
        double weight = 80;
        double height = 1.78;
        String expResult = "Béo phì";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    @Test
    public void testCalculateBMI2() {
        System.out.println("calculateBMI2");
        double weight = 70;
        double height = 1.7;
        String expResult = "Thừa cân";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    @Test
    public void testCalculateBMI3() {
        System.out.println("calculateBMI3");
        double weight = 55;
        double height = 1.7;
        String expResult = "Bình thường";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    @Test
    public void testCalculateBMI4() {
        System.out.println("calculateBMI4");
        double weight = 52;
        double height = 1.7;
        String expResult = "Thiếu cân";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    @Test
    public void testCalculateBMI5() {
        System.out.println("calculateBMI5");
        double weight = 70;
        double height = 1.7;
        String expResult = "Thừa cân";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
}
