/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author franci
 */
public class SamplesTest
{
    
    public SamplesTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of lcm method, of class Samples.
     */
    @Test
    public void testLcm_intArr()
    {
        assertEquals(6, Samples.lcm(2,3));
        assertEquals(1800, Samples.lcm(72,50));
        assertEquals(66, Samples.lcm(6,33));
        assertEquals(45360, Samples.lcm(324,16,7,5));

        assertEquals(12, Samples.lcm(4,6));
        assertEquals(42, Samples.lcm(21,6));
        assertEquals(504, Samples.lcm(8,9,21));
    }

    /**
     * Test of gcd method, of class Samples.
     */
    @Test
    public void testGcd_intArr()
    {
        assertEquals(12, Samples.gcd(36,60));
        assertEquals(12, Samples.gcd(48,60));
        assertEquals(9, Samples.gcd(9,0));
        assertEquals(14, Samples.gcd(42,56));
        assertEquals(4, Samples.gcd(8,12));
        assertEquals(6, Samples.gcd(54,24));
        assertEquals(6, Samples.gcd(48,18));
    }

    /**
     * Test of lcm method, of class Samples.
     */
    @Test
    public void testLcm_longArr()
    {
        assertEquals(6L, Samples.lcm(2L,3L));
        assertEquals(1800L, Samples.lcm(72L,50L));
        assertEquals(66L, Samples.lcm(6L,33L));
        assertEquals(45360L, Samples.lcm(324L,16L,7L,5L));

        assertEquals(12L, Samples.lcm(4L,6L));
        assertEquals(42L, Samples.lcm(21L,6L));
        assertEquals(504L, Samples.lcm(8L,9L,21L));
    }

    /**
     * Test of gcd method, of class Samples.
     */
    @Test
    public void testGcd_longArr()
    {
        assertEquals(12L, Samples.gcd(36L,60L));
        assertEquals(12L, Samples.gcd(48L,60L));
        assertEquals(9L, Samples.gcd(9L,0L));
        assertEquals(14L, Samples.gcd(42L,56L));
        assertEquals(4L, Samples.gcd(8L,12L));
        assertEquals(6L, Samples.gcd(54L,24L));
        assertEquals(6L, Samples.gcd(48L,18L));
    }

    /**
     * Test of merge method, of class Samples.
     */
    @Test
    public void testMerge_intArr_intArr()
    {
        int[] empty = {};
        int[] even = {2,4,6,8};
        int[] odds = {1,3,5,7,9};
        int[] all = {2,4,6,8,1,3,5,7,9};
        
        assertArrayEquals(empty, Samples.merge(empty,empty));
        assertArrayEquals(all, Samples.merge(even,odds));
    }

    /**
     * Test of merge method, of class Samples.
     */
    @Test
    public void testMerge_longArr_longArr()
    {
        long[] empty = {};
        long[] even = {2,4,6,8};
        long[] odds = {1,3,5,7,9};
        long[] all = {2,4,6,8,1,3,5,7,9};
        
        assertArrayEquals(empty, Samples.merge(empty,empty));
        assertArrayEquals(all, Samples.merge(even,odds));
    }

    /**
     * Test of asLong method, of class Samples.
     */
    @Test
    public void testAsLong_intArr()
    {
        int[] empty1 = {};
        int[] even1 = {2,4,6,8};
        int[] odd1 = {1,3,5,7,9};
        int[] all1 = {2,4,6,8,1,3,5,7,9};

        
        long[] empty2 = {};
        long[] even2 = {2,4,6,8};
        long[] odd2 = {1,3,5,7,9};
        long[] all2 = {2,4,6,8,1,3,5,7,9};

        assertArrayEquals(empty2, Samples.asLong(empty1));
        assertArrayEquals(even2, Samples.asLong(even1));
        assertArrayEquals(odd2, Samples.asLong(odd1));
        assertArrayEquals(all2, Samples.asLong(all1));

    }

    /**
     * Test of asLong method, of class Samples.
     */
    @Test
    public void testAsLong_intArrArr()
    {
        int[] empty1 = {};
        int[] even1 = {2,4,6,8};
        int[] odd1 = {1,3,5,7,9};
        int[] all1 = {2,4,6,8,1,3,5,7,9};

        int[][] full1 = {empty1, even1, odd1, all1};
        int[][] empty3 = {};
        
        long[] empty2 = {};
        long[] even2 = {2,4,6,8};
        long[] odd2 = {1,3,5,7,9};
        long[] all2 = {2,4,6,8,1,3,5,7,9};

        long[][] full2 = {empty2, even2, odd2, all2};
        int[][] empty4 = {};

        
        assertArrayEquals(full2, Samples.asLong(full1));
        assertArrayEquals(empty4, Samples.asLong(empty3));
    }

    /**
     * Test of split method, of class Samples.
     */
    @Test
    public void testSplit()
    {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[][] a1 = {{0},{1},{2},{3},{4},{5},{6},{7},{8},{9}};
        int[][] a2 = {{0,1},{2,3},{4,5},{6,7},{8,9}};
        int[][] a3 = {{0,1,2},{3,4,5},{6,7,8},{9}};
        int[][] a4 = {{0,1,2,3},{4,5,6,7},{8,9}};

        assertArrayEquals(a1, Samples.split(a, 1));
        assertArrayEquals(a2, Samples.split(a, 2));
        assertArrayEquals(a3, Samples.split(a, 3));
        assertArrayEquals(a4, Samples.split(a, 4));
    }
    
}
