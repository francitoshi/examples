/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author franci
 */
public class Samples
{
    public static int min(int... n)
    {
        return 0;
    }
    public static long min(long... n)
    {
        return 0;
    }
    public static int max(int... n)
    {
        return 0;
    }
    public static long max(long... n)
    {
        return 0;
    }
            
    public static double avg(int... n)
    {
        return 0;
    }
    public static double avg(long... n)
    {
        return 0;
    }
            
    public static double avg(float... n)
    {
        return 0;
    }
            
    public static double avg(double... n)
    {
        return 0;
    }
            
    public static int add(int... n)
    {
        return 0;
    }
    public static long add(long... n)
    {
        return 0;
    }
    public static float add(float... n)
    {
        return 0;
    }
    public static double add(double... n)
    {
        return 0;
    }
            
    public static int[][] add(int[][] a,int[][] b)
    {
        return null;
    }
    public static long[][] add(long[][] a,long[][] b)
    {
        return null;
    }
    public static float[][] add(float[][] a,float[][] b)
    {
        return null;
    }
    public static double[][] add(double[][] a,double[][] b)
    {
        return null;
    }
            
    public static int lcm(int... n)
    {
        int[] m = n.clone();
        boolean updated=true;
        int max = 0;
        while(updated)
        {
            updated=false;
            int ant = max;
            for(int i=0;i<n.length;i++)
            {
                while(m[i]<max)
                {
                    m[i] += n[i];
                    updated=true;
                }
                max = Math.max(max, m[i]);
            }
            updated = updated | ant!=max; 
        }
        return max;
    }
    
    public static int gcd(int... n)
    {
        return 0;
    }
    public static long lcm(long... n)
    {
        return 0;
    }
    
    public static long gcd(long... n)
    {
        return 0;
    }
    public static int[] merge(int[] a, int[] b)
    {
        return null;
    }
    public static long[] merge(long[] a, long[] b)
    {
        return null;
    }
    
    public static long[] asLong(int[] a)
    {
        return null;
    }
    public static long[][] asLong(int[][] a)
    {
        return null;
    }
    public static int[][] split(int[] a, int chunksSize)
    {
        return null;
    }
    
}
