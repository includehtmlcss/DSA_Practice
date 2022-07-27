import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x)
    {
		HashMap<Integer,Integer> map=new HashMap<>();
        int xor=0,ans=0;
        for(int i=0;i<arr.size();i++)
        {
            xor=xor^arr.get(i);
            if(xor==x)
            {
                ans++;
            }
            int y=xor^x;
            if(map.containsKey(y))
            {
                ans+=map.get(y);
            }
            if(map.containsKey(xor))
            {
                map.put(xor,map.get(xor)+1);
            }
            else
            {
                map.put(xor,1);
            }
        }
        return ans;
	}
}
