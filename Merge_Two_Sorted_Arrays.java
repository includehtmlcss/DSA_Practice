import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int a1[], int a2[], int m, int n)
    {
        int i=0,j=0,k=0;
        int[] a=new int[m+n];
        while(i<m && j<n)
        {
            if(a1[i]<a2[j])
            {
                a[k]=a1[i];
                k++;
                i++;
            }
            else
            {
                a[k]=a2[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            a[k]=a1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            a[k]=a2[j];
            k++;
            j++;
        }
        return a;
    }
}
