// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        
        for(int i=0;i<n;i++)
        {
            
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            
            else{
                hm.put(arr[i],1);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(hm.get(arr[i])>1)
            {
                 al.add(arr[i]);
                 hm.put(arr[i],0);
            }
            
        }
        
      
        Collections.sort(al);
       // Collections.sort(al,Collections.reverseOrder());
        
        if(al.isEmpty())
        {
            al.add(-1);
            return al;
        }
        
        return al;
    }
}
