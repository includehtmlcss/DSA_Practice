import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices)
    {
        int min=prices.get(0),max=0;
        for(int i=1;i<prices.size();i++)
        {
            if(prices.get(i)-min>max)
            {
                max=prices.get(i)-min;
            }
            if(prices.get(i)<min)
            {
                min=prices.get(i);
            }
        }
        return max;
    }
}
