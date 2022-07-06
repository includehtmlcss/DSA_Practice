import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void merge(Interval a1[],Interval a2[],Interval a[])
    {
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length)
        {
            if(a1[i].start<a2[j].start)
            {
                a[k]=a1[i];
                i++;
                k++;
            }
            else
            {
                a[k]=a2[j];
                j++;
                k++;
            }
        }
        while(i<a1.length)
        {
            a[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length)
        {
            a[k]=a2[j];
            j++;
            k++;
        }
    }
    public static void sort(Interval a[])
    {
        if(a.length==1)
        {
            return;
        }
        Interval[] a1=new Interval[a.length/2];
        Interval[] a2=new Interval[a.length-a1.length];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=a[i];
        }
        for(int i=a1.length;i<a.length;i++)
        {
            a2[i-a1.length]=a[i];
        }
        sort(a1);
        sort(a2);
        merge(a1,a2,a);
    }
    public static boolean doesMerge(Interval i1,Interval i2)
    {
        if((i2.start<=i1.finish && i1.finish<=i2.finish) || (i1.start<=i2.finish && i2.finish<=i1.finish))
        {
            return true;
        }
        return false;
    }
    public static List<Interval> mergeIntervals(Interval[] intervals)
    {
        sort(intervals);
        List<Interval> ans=new ArrayList<>();
        Interval temp=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(doesMerge(temp,intervals[i]))
            {
                temp=new Interval(Math.min(temp.start,intervals[i].start),Math.max(temp.finish,intervals[i].finish));
            }
            else
            {
                ans.add(temp);
                temp=intervals[i];
            }
        }
        ans.add(temp);
        return ans;
    }
}










