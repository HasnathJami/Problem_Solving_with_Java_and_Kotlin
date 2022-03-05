// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        
        HashMap<Character,Integer>hm= new HashMap<Character,Integer>();
        
        for(int i=0;i<S.length();i++){
            
            char c=S.charAt(i);
            
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else{
                
                hm.put(c,1);
            }
        }
        
        
        char ch='$';
        for(int i=0;i<S.length();i++)
        {
           if(hm.get(S.charAt(i))==1)
           {
               ch=S.charAt(i);
             
              break;
           }
        }
        
        return ch;
    }
    
    
    
    
    
}

