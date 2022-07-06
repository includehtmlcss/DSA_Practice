import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n)
    {
        return mergeSort(arr);
    }
    public static long mergeSort(long a[])
    {
        if(a.length==1)
        {
            return 0;
        }
        long[] a1=new long[a.length/2];
        long[] a2=new long[a.length-a1.length];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=a[i];
        }
        for(int i=a1.length;i<a.length;i++)
        {
            a2[i-a1.length]=a[i];
        }
        long left=mergeSort(a1);
        long right=mergeSort(a2);
        long count=left+right;
        count+=merge(a1,a2,a);
        return count;
    }
    public static long merge(long a1[],long a2[],long a[])
    {
        int i=0,j=0,k=0;
        long count=0;
        while(i<a1.length && j<a2.length)
        {
            if(a1[i]>a2[j])
            {
                a[k]=a2[j];
                j++;
                k++;
                count+=(a1.length-i);
            }
            else
            {
                a[k]=a1[i];
                i++;
                k++;
            }
        }
        while(i<a1.length)
        {
            a[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length)
        {
            a[k]=a2[j];
            j++;
            k++;
        }
        return count;
    }
}
