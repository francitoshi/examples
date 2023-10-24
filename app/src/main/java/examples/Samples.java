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
