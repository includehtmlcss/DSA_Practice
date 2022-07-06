import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> a, int n)
    {
        int slow=a.get(0),fast=a.get(0);
        do
        {
            slow=a.get(slow);
            fast=a.get(a.get(fast));
        }while(slow!=fast);
        slow=a.get(0);
        while(slow!=fast)
        {
            slow=a.get(slow);
            fast=a.get(fast);
        }
        return slow;
    }
}
