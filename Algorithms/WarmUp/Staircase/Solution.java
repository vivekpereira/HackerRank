import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        String pattern="";
        for(int i=1; i<=n;i++){
            pattern="";
            for(int j=0;j<i;j++){
                pattern=pattern+"#";
            }
            System.out.printf("%"+n+"s\n",pattern);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
