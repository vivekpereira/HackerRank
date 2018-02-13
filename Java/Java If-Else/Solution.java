    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if(1<n && n<6)
                {
                    ans ="Not Weird";
                }
                else if(5<n &&n<21)
                {
                    ans ="Weird";
                }
                 else if(20<n)
                {
                    ans ="Not Weird";
                }
                 
               //Complete the code
                
            }
            System.out.println(ans);
            
        }
    }
