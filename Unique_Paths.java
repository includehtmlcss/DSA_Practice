import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n)
    {
		int[][] dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(m,n,0,0,dp);
	}
    public static int helper(int m,int n,int i,int j,int dp[][])
    {
        if(i>=m || j>=n)
        {
            return 0;
        }
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        return (dp[i+1][j]==-1?dp[i+1][j]=helper(m,n,i+1,j,dp):dp[i+1][j])+(dp[i][j+1]==-1?dp[i][j+1]=helper(m,n,i,j+1,dp):dp[i][j+1]);
//         return helper(m,n,i+1,j)+helper(m,n,i,j+1);
    }
}
