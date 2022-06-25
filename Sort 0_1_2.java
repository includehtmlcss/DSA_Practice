import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] a)
    {
        int low=0,mid=0,high=a.length-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                mid++;
                low++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}
