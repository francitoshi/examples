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
        assertEquals(1, Samples.gcd(9,0));
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

    /**
     * Test of min method, of class Samples.
     */
    @Test
    public void testMin_intArr()
    {
        assertEquals(0, Samples.min());
        assertEquals(1, Samples.min(1,2,3));
        assertEquals(1, Samples.min(3,2,1));
        assertEquals(2, Samples.min(3,2,5));
        assertEquals(-5, Samples.min(-3,-2,-5));
    }

    /**
     * Test of min method, of class Samples.
     */
    @Test
    public void testMin_longArr()
    {
        assertEquals(0L, Samples.min(new long[0]));
        assertEquals(1L, Samples.min(1L,2L,3L));
        assertEquals(1L, Samples.min(3L,2L,1L));
        assertEquals(2L, Samples.min(3L,2L,5L));
        assertEquals(-5L, Samples.min(-3L,-2L,-5L));
    }

    /**
     * Test of max method, of class Samples.
     */
    @Test
    public void testMax_intArr()
    {
        assertEquals(0, Samples.max());
        assertEquals(3, Samples.max(1,2,3));
        assertEquals(3, Samples.max(3,2,1));
        assertEquals(5, Samples.max(3,2,5));
        assertEquals(-2, Samples.max(-3,-2,-5));
    }

    /**
     * Test of max method, of class Samples.
     */
    @Test
    public void testMax_longArr()
    {
        assertEquals(0L, Samples.max(new long[0]));
        assertEquals(3L, Samples.max(1L,2L,3L));
        assertEquals(3L, Samples.max(3L,2L,1L));
        assertEquals(5L, Samples.max(3L,2L,5L));
        assertEquals(-2L, Samples.max(-3L,-2L,-5L));
    }

    /**
     * Test of avg method, of class Samples.
     */
    @Test
    public void testAvg_intArr()
    {
        assertEquals(0, Samples.avg());
        assertEquals(2, Samples.avg(1,2,3));
        assertEquals(2, Samples.avg(3,2,1));
        assertEquals(3.333f, Samples.avg(3,2,5),0.005f);
        assertEquals(-3.333f, Samples.avg(-3,-2,-5),0.005f);
    }

    /**
     * Test of avg method, of class Samples.
     */
    @Test
    public void testAvg_longArr()
    {
        assertEquals(0, Samples.avg(new long[0]));
        assertEquals(2, Samples.avg(1L,2L,3L));
        assertEquals(2, Samples.avg(3L,2L,1L));
        assertEquals(3.333f, Samples.avg(3L,2L,5L),0.005f);
        assertEquals(-3.333f, Samples.avg(-3L,-2L,-5L),0.005f);
    }

    /**
     * Test of avg method, of class Samples.
     */
    @Test
    public void testAvg_floatArr()
    {
        assertEquals(0, Samples.avg(new float[0]));
        assertEquals(2, Samples.avg(1f,2f,3f));
        assertEquals(2, Samples.avg(3f,2f,1f));
        assertEquals(3.333f, Samples.avg(3f,2f,5f),0.005f);
        assertEquals(-3.333f, Samples.avg(-3f,-2f,-5f),0.005f);
    }

    /**
     * Test of avg method, of class Samples.
     */
    @Test
    public void testAvg_doubleArr()
    {
        assertEquals(0.0, Samples.avg(new double[0]));
        assertEquals(2.0, Samples.avg(1d,2d,3d));
        assertEquals(2.0, Samples.avg(3d,2d,1d));
        assertEquals(3.333, Samples.avg(3d,2d,5d),0.005d);
        assertEquals(-3.333, Samples.avg(-3d,-2d,-5d),0.005d);
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_intArr()
    {
        assertEquals(0, Samples.add());
        assertEquals(6, Samples.add(1,2,3));
        assertEquals(6, Samples.add(3,2,1));
        assertEquals(10, Samples.add(3,2,5));
        assertEquals(-10, Samples.add(-3,-2,-5));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_longArr()
    {
        assertEquals(0, Samples.add(new long[0]));
        assertEquals(6, Samples.add(1L,2L,3L));
        assertEquals(6, Samples.add(3L,2L,1L));
        assertEquals(10, Samples.add(3L,2L,5L));
        assertEquals(-10, Samples.add(-3L,-2L,-5L));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_floatArr()
    {
        assertEquals(0, Samples.add(new float[0]));
        assertEquals(6, Samples.add(1f,2f,3f));
        assertEquals(6, Samples.add(3f,2f,1f));
        assertEquals(10, Samples.add(3f,2f,5f));
        assertEquals(-10, Samples.add(-3f,-2f,-5f));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_doubleArr()
    {
        assertEquals(0, Samples.add(new float[0]));
        assertEquals(6, Samples.add(1d,2d,3d));
        assertEquals(6, Samples.add(3d,2d,1d));
        assertEquals(10, Samples.add(3d,2d,5d));
        assertEquals(-10, Samples.add(-3d,-2d,-5d));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_intArrArr_intArrArr()
    {
        int[][] m1_1 = {{1}};
        int[][] m1_2 = {{2}};
        assertArrayEquals(m1_2, Samples.add(m1_1, m1_1));
        int[][] m2_1 =
        {
            {1, 1}, 
            {1, 1}
        };
        int[][] m2_2 = 
        {
            {2, 2}, 
            {2, 2}
        };
        assertArrayEquals(m2_2, Samples.add(m2_1, m2_1));
        int[][] m3_a =
        {
            {1, 2}, 
            {3, 4}
        };
        int[][] m3_b = 
        {
            {9, 8}, 
            {7, 6}
        };
        int[][] m3_c = 
        {
            {10, 10}, 
            {10, 10}
        };
        assertArrayEquals(m3_c, Samples.add(m3_a, m3_b));
        int[][] m12_1 =
        {
            {1, 1},
        };
        int[][] m12_2 = 
        {
            {2, 2},
        };
        assertArrayEquals(m12_2, Samples.add(m12_1, m12_1));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_longArrArr_longArrArr()
    {
        long[][] m1_1 = {{1}};
        long[][] m1_2 = {{2}};
        assertArrayEquals(m1_2, Samples.add(m1_1, m1_1));
        long[][] m2_1 =
        {
            {1, 1}, 
            {1, 1}
        };
        long[][] m2_2 = 
        {
            {2, 2}, 
            {2, 2}
        };
        assertArrayEquals(m2_2, Samples.add(m2_1, m2_1));
        long[][] m3_a =
        {
            {1, 2}, 
            {3, 4}
        };
        long[][] m3_b = 
        {
            {9, 8}, 
            {7, 6}
        };
        long[][] m3_c = 
        {
            {10, 10}, 
            {10, 10}
        };
        assertArrayEquals(m3_c, Samples.add(m3_a, m3_b));
        long[][] m12_1 =
        {
            {1, 1} 
        };
        long[][] m12_2 = 
        {
            {2, 2}
        };
        assertArrayEquals(m12_2, Samples.add(m12_1, m12_1));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_floatArrArr_floatArrArr()
    {
        float[][] m1_1 = {{1}};
        float[][] m1_2 = {{2}};
        assertArrayEquals(m1_2, Samples.add(m1_1, m1_1));
        float[][] m2_1 =
        {
            {1, 1}, 
            {1, 1}
        };
        float[][] m2_2 = 
        {
            {2, 2}, 
            {2, 2}
        };
        assertArrayEquals(m2_2, Samples.add(m2_1, m2_1));
        float[][] m3_a =
        {
            {1, 2}, 
            {3, 4}
        };
        float[][] m3_b = 
        {
            {9, 8}, 
            {7, 6}
        };
        float[][] m3_c = 
        {
            {10, 10}, 
            {10, 10}
        };
        assertArrayEquals(m3_c, Samples.add(m3_a, m3_b));
    }

    /**
     * Test of add method, of class Samples.
     */
    @Test
    public void testAdd_doubleArrArr_doubleArrArr()
    {
        double[][] m1_1 = {{1}};
        double[][] m1_2 = {{2}};
        assertArrayEquals(m1_2, Samples.add(m1_1, m1_1));
        double[][] m2_1 =
        {
            {1, 1}, 
            {1, 1}
        };
        double[][] m2_2 = 
        {
            {2, 2}, 
            {2, 2}
        };
        assertArrayEquals(m2_2, Samples.add(m2_1, m2_1));
        double[][] m3_a =
        {
            {1, 2}, 
            {3, 4}
        };
        double[][] m3_b = 
        {
            {9, 8}, 
            {7, 6}
        };
        double[][] m3_c = 
        {
            {10, 10}, 
            {10, 10}
        };
        assertArrayEquals(m3_c, Samples.add(m3_a, m3_b));
    }

    /**
     * Test of multiplicationTable method, of class Samples.
     */
    @Test
    public void testMultiplicationTable()
    {
        int[][][] t1_1 = 
        {
            {
                {1,1,1}
            },
        };
        int[][][] t2_2 = 
        {
            {
                {2,2,4}
            },
        };
        int[][][] t1_3 = 
        {
            {
                {1,1,1},
                {1,2,2},
                {1,3,3},
            },
            {
                {2,1,2},
                {2,2,4},
                {2,3,6},
            },
            {
                {3,1,3},
                {3,2,6},
                {3,3,9},
            },
        };
        int[][][] t2_3 = 
        {
            {
                {2,2,4},
                {2,3,6},
            },
            {
                {3,2,6},
                {3,3,9},
            },
        };
        assertArrayEquals(t1_1, Samples.multiplicationTable(1, 1));
        assertArrayEquals(t2_2, Samples.multiplicationTable(2, 2));
        assertArrayEquals(t1_3, Samples.multiplicationTable(1, 3));
        assertArrayEquals(t2_3, Samples.multiplicationTable(2, 3));

        int[][][] t10 = Samples.multiplicationTable(1, 10);
        assertEquals(10, t10.length);
        assertEquals(10, t10[0].length);
        assertEquals(3, t10[0][0].length);
        
        for(int i=0;i<t10.length;i++)
        {
            for(int j=0;j<t10.length;j++)
            {
                assertEquals(i+1, t10[i][j][0]);
                assertEquals(j+1, t10[i][j][1]);
                assertEquals((i+1)*(j+1), t10[i][j][2]);
            }
        }
        
    }
    
}
