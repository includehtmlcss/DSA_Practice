import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> a, int m, int n, int target)
    {
		for(int i=0;i<a.size();i++)
        {
            if(search(a.get(i),0,a.get(i).size()-1,target))
            {
                return true;
            }
        }
        return false;
	}
    static boolean search(ArrayList<Integer> a,int lo,int hi,int x)
    {
        if(lo>hi)
        {
            return false;
        }
        if(x<a.get(lo) || a.get(hi)<x)
        {
            return false;
        }
        int mid=(lo+hi)/2;
        if(a.get(mid)==x)
        {
            return true;
        }
        else if(a.get(mid)>x)
        {
            return search(a,lo,mid,x);
        }
        else
        {
            return search(a,mid+1,hi,x);
        }
    }
}
