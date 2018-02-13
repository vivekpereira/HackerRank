import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int n=grades.length;
        int mod=0;
        for(int i=0;i<n;i++){
            if(grades[i]>=38){
                mod=grades[i]%10;
                if(mod==3){
                    grades[i]=grades[i]+2;
                }
                else if(mod==4){
                        grades[i]=grades[i]+1;   
                }
                else if(mod==8){
                    grades[i]=grades[i]+2;
                }
                else if(mod==9){
                        grades[i]=grades[i]+1;
                    
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
