import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String arr[];
        if(s.contains("AM")){
            arr=s.split(":");
            arr[0].equals("12");
            s=s.replace("12:","00:");
           s= s.replace("AM","");
        }
        else {
            arr=s.split(":");
           
            int n = Integer.parseInt(arr[0]);
            if(n!=12){
                n=12+n;
            }
            s=s.replace(arr[0]+":",n+":");
            s=s.replace("PM","");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
