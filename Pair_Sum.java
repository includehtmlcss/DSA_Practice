import java.util.* ;
import java.io.*; 
class Pair
{
    int a,b;
    public Pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
public class Solution{
    public static int[][] pairSum(int[] a, int s)
    {
//         Arrays.sort(a);
//         int i=0,j=a.length-1;
        ArrayList<Pair> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(s-a[i]))
            {
                int loop;
                if(a[i]==s-a[i])
                {
                    loop=(map.get(a[i])*(map.get(a[i])-1))/2;
                }
                else
                {
                    loop=map.get(s-a[i])*map.get(a[i]);
                }
                for(int j=0;j<loop;j++)
                {
                    ans.add(new Pair(Math.min(a[i],s-a[i]),Math.max(a[i],s-a[i])));
                }
                map.put(a[i],0);
                map.put(s-a[i],0);
            }
        }
//         while(i<j)
//         {
//             if(a[i]+a[j]<s)
//             {
//                 i++;
//             }
//             else if(a[i]+a[j]>s)
//             {
//                 j--;
//             }
//             else
//             {
//                 int count1=1;
//                 while(i<j && i+1<a.length && a[i]==a[i+1])
//                 {
//                     i++;
//                     count1++;
//                 }
//                 int count2=1;
//                 while(j>i && j-1>=0 && a[j]==a[j-1])
//                 {
//                     j--;
//                     count2++;
//                 }
//                 int loop=count1*count2;
//                 if(i==j)
//                 {
//                     loop=(count1*(count1-1))/2;
//                 }
//                 for(int k=0;k<loop;k++)
//                 {
//                     ans.add(new Pair(a[i],a[j]));
//                 }
//                 i++;
//                 j--;
//             }
//         }
        int[][] ans1=new int[ans.size()][2];
        int i=0;
        for(Pair p:ans)
        {
            ans1[i][0]=p.a;
            ans1[i][1]=p.b;
            i++;
        }
        return ans1;
    }
}
