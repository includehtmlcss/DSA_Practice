import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr)
    {
        int maxLen=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
            if(sum==0)
            {
                maxLen=i+1;
            }
            else if(map.containsKey(sum))
            {
                if(i-map.get(sum)>maxLen)
                {
                    maxLen=i-map.get(sum);
                }
            }
            else
            {
                map.put(sum,i);
            }
        }
        return maxLen;
	}
}
