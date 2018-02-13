

import java.util.Scanner;

public class Solution {
 public static void main(String arg[]) {
	 Scanner sc = new Scanner(System.in);
	 String StrN = sc.nextLine();
	 int n=Integer.parseInt(StrN);
	 int numArr[]= new int[Integer.parseInt(StrN)];
	 String str=sc.nextLine();
	 String strArr[]= str.split(" ");
	 for(int i=0;i<n;i++) {
		 numArr[i]= Integer.parseInt(strArr[i]);
		 
	 }
	 for(int i=n-1;i>=0;i--) {
		 System.out.print(numArr[i]+" ");
		 
	 }
	 
	 
 }
}
