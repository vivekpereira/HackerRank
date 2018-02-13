import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int numApples=0;
        int numOranges=0;
        int nApp=apples.length;
        int nOrg=oranges.length;
        int d=0;
        for(int i=0;i<nApp;i++){
            
            if(apples[i]>=0){
                d=a+apples[i];
                
                if(s<=d && d<=t){
                    numApples++;
                }
            }
        }
        for(int i=0;i<nOrg;i++){
            
            if(oranges[i]<=0){
                d=b+oranges[i];
                 
                if(s<=d && d<=t){
                    numOranges++;
                }
            }
        }
        System.out.print(numApples+"\n"+numOranges);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
