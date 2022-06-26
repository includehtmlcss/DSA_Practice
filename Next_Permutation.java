import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<Integer> reverse(ArrayList<Integer> a)
    {
        int k=a.size()-1;
        for(int i=0;i<a.size()/2;i++)
        {
            int temp=a.get(i);
            a.set(i,a.get(k));
            a.set(k,temp);
            k--;
        }
        return a;
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> p) 
	{
		int i1=-1;
        for(int i=p.size()-2;i>=0;i--)
        {
            if(p.get(i)<p.get(i+1))
            {
                i1=i;
                break;
            }
        }
        if(i1==-1)
        {
            return reverse(p);
        }
        int i2=p.size()-1;
        for(int i=p.size()-1;i>=i1+1;i--)
        {
            if(p.get(i)>p.get(i1))
            {
                i2=i;
                break;
            }
        }
        int temp=p.get(i1);
        p.set(i1,p.get(i2));
        p.set(i2,temp);
        int k=p.size()-1;
        for(int i=i1+1;i<=(p.size()+i1)/2;i++)
        {
            temp=p.get(i);
            p.set(i,p.get(k));
            p.set(k,temp);
            k--;
        }
        return p;
	}
}
