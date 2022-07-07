import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n)
    {
		int count=0,candidate=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                candidate=arr[i];
            }
            if(candidate==arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==candidate)
            {
                count++;
            }
        }
        return count>Math.floor(arr.length/2)?candidate:-1;
	}
}
