/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int loop = sc.nextInt();
	    for(int i = 0 ; i < loop ; i++){
	        int a = sc.nextInt();
	        int []A = new int[a+1];
	        for(int j=0;j<a;j++){
	            A[j]=sc.nextInt();
	        }
	        int b = sc.nextInt();
	        int []B = new int[b];
	        for(int j=0;j<b;j++){
	            B[j]=sc.nextInt();
	        }
	        int X= B[b-1];
	        A[a]=X;
	        int sum = 0;
	        for(int j = 0 ; j <a+1; j++){
	            sum=sum+A[i];
	        }
			for(int j = 0 ; j < a
	        System.out.println(A[i]);
	    }
	   
		// your code goes here
	}
}
