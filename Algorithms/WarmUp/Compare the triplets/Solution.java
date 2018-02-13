import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int []totalPoints = {0,0};
        if(a0>b0){
            totalPoints[0]=totalPoints[0]+1;
            
        }
        else if(a0<b0){
            totalPoints[1]=totalPoints[1]+1;
        }
         if(a1>b1){
            totalPoints[0]=totalPoints[0]+1;
            
        }
        else if(a1<b1){
            totalPoints[1]=totalPoints[1]+1;
        }
         if(a2>b2){
            totalPoints[0]=totalPoints[0]+1;
            
        }
        else if(a2<b2){
            totalPoints[1]=totalPoints[1]+1;
        }
        return totalPoints;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
