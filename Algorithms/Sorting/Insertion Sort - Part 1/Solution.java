import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort1(int n, int[] arr) {
        int temp=0;
        int index=0;

        for(int i=1;i<arr.length;i++){
            index=i-1;
            temp=arr[i];
            
            
            while(index>=0 && arr[index]>temp){
                arr[index+1]=arr[index];
                index=index-1;
                for(int k=0;k<arr.length;k++){
                  System.out.print(arr[k]+" ");
                  
              }  
                System.out.println();
            }
            arr[index+1]=temp;           
            
        }
         for(int k=0;k<arr.length;k++){
                  System.out.print(arr[k]+" ");
                  
              }  
                System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
