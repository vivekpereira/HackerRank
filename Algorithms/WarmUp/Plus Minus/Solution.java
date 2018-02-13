import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                countNeg++;
            }
            else if(arr[i]>0){
                countPos++;
            }
            else{
                countZero++;
            }
        }
        System.out.println((float)countPos/arr.length);
        System.out.println((float)countNeg/arr.length);
        System.out.println((float)countZero/arr.length);
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
