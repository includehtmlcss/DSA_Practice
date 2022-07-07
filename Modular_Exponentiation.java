import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return m==1?0:1;
        }
        if(n==1)
        {
            return x%m;
        }
        
        if(n%2==0)
        {
            long ans=modularExponentiation(x,n/2,m);
            return (int)((ans*ans)%m);
        }
        else
        {
            int ans=(int)((long)(x%m)*(long)(modularExponentiation(x,n-1,m)%m)%m)+m;
            return ans%m;
        }
    }
}
