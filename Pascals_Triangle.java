import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n)
    {
        if(n==1)
        {
            ArrayList<ArrayList<Long>> ans=new ArrayList<>();
            ArrayList<Long> a=new ArrayList<>();
            a.add(1L);
            ans.add(a);
            return ans;
        }
        ArrayList<ArrayList<Long>> smallAns=printPascal(n-1);
        ArrayList<Long> nminus1=smallAns.get(smallAns.size()-1);
        ArrayList<Long> nth=new ArrayList<>();
        nth.add(1L);
        for(int i=0;i<nminus1.size()-1;i++)
        {
            nth.add(nminus1.get(i)+nminus1.get(i+1));
        }
        nth.add(1L);
        smallAns.add(nth);
        return smallAns;
	}
}
