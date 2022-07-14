import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] a, int N)
    {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],false);
        }
        int max=1;
        for(int i=0;i<a.length;i++)
        {
            if(!map.get(a[i]))
            {
                int j=1,count=1;
                map.put(a[i],true);
                while(map.containsKey(a[i]+j))
                {
                    count++;
                    map.put(a[i]+j,true);
                    j++;
                }
                j=1;
                while(map.containsKey(a[i]-j))
                {
                    count++;
                    map.put(a[i]-j,true);
                    j++;
                }
                if(count>max)
                {
                    max=count;
                }
            }
        }
        return max;
    }
}
