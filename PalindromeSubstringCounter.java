//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class PalindromeSubstringCounter
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     public int CountPS(String S, int N)
    {
        //code here
        int count = 0;
      for(int i = 0;i <= N - 1; i++){
        for(int j = i + 2; j <= N; j++){
           String s = S.substring(i , j);
           if(isPalindrome(s) && s.length() >= 2){
               count++;
           }
        }
      }
      return count;
    }
    
    boolean isPalindrome(String S)
    {
          int i = 0;
        int j = S.length()-1;
        while(i<=j){
            if(S.charAt(i) != S.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        }
}