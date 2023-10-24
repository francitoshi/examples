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
        int[] a= n.clone();
        boolean nop=false;
        while(nop==false)
        {
            nop=true;
            for(int i=0;i<n.length;i++)
            {
                if(i<n.length-1)
                {
                    if(a[i]<a[i+1])
                    {
                        a[i]+=n[i];
                        nop=false;
                    }
                }
                else
                {
                   if(a[i-1]>a[i])
                    {
                        a[i]+=n[i];
                        nop=false;
                    } 
                }
            }
       }
        return a[0];
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
