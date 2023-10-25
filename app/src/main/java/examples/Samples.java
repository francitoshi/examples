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
        int a =n.length==0? 0 : Integer.MAX_VALUE;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<a)
            {
                a=n[i];
            }
        }
        return a;
    }
    public static long min(long... n)
    {
        long a = n.length==0 ? 0 : Long.MAX_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<a)
            {
                a=n[i];
            }
        }
        return a;
    }
    public static int max(int... n)
    {
        int a = n.length==0 ? 0 : Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>a)
            {
                a=n[i];
            }
        }
        return a;
    }
    public static long max(long... n)
    {
        long a = n.length==0?0: Long.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>a)
            {
                a=n[i];
            }
        }
        return a;
    }
            
    public static double avg(int... n)
    {
        double sum=0.0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return n.length==0 ? 0 : sum/n.length;
    }
    public static double avg(long... n)
    {
        double sum=0.0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return n.length==0 ? 0 : sum/n.length;
    }
            
    public static double avg(float... n)
    {
        double sum=0.0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return n.length==0 ? 0 : sum/n.length;
    }
            
    public static double avg(double... n)
    {
        double sum=0.0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return n.length==0 ? 0 : sum/n.length;
    }
            
    public static int add(int... n)
    {
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return sum;
    }
    public static long add(long... n)
    {
        long sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return sum;
    }
    public static float add(float... n)
    {
        float sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return sum;
    }
    public static double add(double... n)
    {
        double sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
        }
        return sum;
    }
            
    public static int[][] add(int[][] a,int[][] b)
    {
        if(a.length==0 || b.length==0)
        {
            return new int[0][0];
        }
        int c[][] = new int[b.length][b[0].length];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static long[][] add(long[][] a,long[][] b)
    {
        if(a.length==0 || b.length==0)
        {
            return new long[0][0];
        }
        long c[][] = new long[b.length][b[0].length];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static float[][] add(float[][] a,float[][] b)
    {
        if(a.length==0 || b.length==0)
        {
            return new float[0][0];
        }
        float c[][] = new float[b.length][b[0].length];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static double[][] add(double[][] a,double[][] b)
    {
        if(a.length==0 || b.length==0)
        {
            return new double[0][0];
        }
        double c[][] = new double[b.length][b[0].length];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
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
        int m = min(n);
        for(int i=m;i>0;i--)
        {
            boolean div=true;
            for(int j=0;j<n.length;j++)
            {
                if(n[j]%i!=0)
                {
                    div=false;
                    break;
                }
            }
            if(div==true)
            {
                return i;
            }
        }
        return 1;
    }
    public static long lcm(long... n)
    {
        long[] m = n.clone();
        boolean updated=true;
        long max = 0;
        while(updated)
        {
            updated=false;
            long ant = max;
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
    public static int[][][] multiplicationTable(int min, int max)
    {
        return null;
    }
    
}
