import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sumDig1= 0;
        int sumDig2= 0;
        for(int i=0,j=a.length-1;i<a.length;i++,j--){
            sumDig1= sumDig1+a[i][i];
            sumDig2= sumDig2+a[i][j];
        }
        if(sumDig1>sumDig2)
        return sumDig1-sumDig2;
        else
            return sumDig2-sumDig1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
