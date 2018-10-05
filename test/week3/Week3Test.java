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
        System.out.println("test max 1");
        assertEquals(-3, Week3.max(-5, -3));
    }
    @Test
    public void testMax2(){
        System.out.println("test max 2");
        assertEquals(0, Week3.max(0,-5));
    }
    @Test
    public void testMax3(){
        System.out.println("test max 3");
        assertEquals(7, Week3.max(-5, 7));
    }
    @Test
    public void testMax4(){      
        System.out.println("test max 4");
        assertEquals(4, Week3.max(4, 4));
    }
    @Test
    public void testMax5(){
        System.out.println("test max 5");
        assertEquals(9, Week3.max(9, 3));
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
        assertEquals(-20, Week3.minOfArray(array));
    }
    @Test
    public void testMinOfArray2() {
        System.out.println("test minOfArray2");
        int[] array = new int[3];
        array[0]=-3;
        array[1]=9;
        array[2]=-10;
        assertEquals(-10, Week3.minOfArray(array));
    }
    @Test
    public void testMinOfArray3() {
        System.out.println("test minOfArray3");
        int[] array = new int[3];
        array[0]=-3;
        array[1]=0;
        array[2]=5;
        assertEquals(-3, Week3.minOfArray(array));
    }
@Test
    public void testMinOfArray4() {
        System.out.println("test minOfArray4");
        int[] array = new int[3];
        array[0]=0;
        array[1]=0;
        array[2]=0;
        assertEquals(0, Week3.minOfArray(array));
    }   
    @Test
    public void testMinOfArray5() {
        System.out.println("test minOfArray5");
        int[] array = new int[3];
        array[0]=5;
        array[1]=9;
        array[2]=9;
        assertEquals(5, Week3.minOfArray(array));
    }
    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI1() {
        System.out.println("test BMI 1");
        assertEquals("Béo phì", Week3.calculateBMI(80, 1.78));
    }
    @Test
    public void testCalculateBMI2(){
        System.out.println("test BMI 2");
        assertEquals("Bình thường",Week3.calculateBMI(55, 1.7));
    }
    @Test
    public void testCalculateBMI3(){
        System.out.println("test BMI 3");
        assertEquals("Thừa cân",Week3.calculateBMI(70, 1.7));
    }
    @Test
    public void testCalculateBMI4(){
        System.out.println("test BMI 4");
        assertEquals("Thiếu cân", Week3.calculateBMI(52, 1.7));
    }
    @Test 
    public void testCalculateBMI5(){
        System.out.println("test BMI 5");
        assertEquals("Thừa cân",Week3.calculateBMI(71, 1.71));
    }    
}
