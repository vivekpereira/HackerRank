import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        int n = arr.length;
        arr=sortedArray(arr,n);
        long min=arr[0];
        long max=arr[4];
        for(int i=1;i<4;i++){
            min=min+arr[i];
            max=max+arr[i];
        }
        System.out.print(min+" "+max);
    }
    static int[] sortedArray(int [] arr,int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                  temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                
            }
        }
      
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
