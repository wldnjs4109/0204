import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,X;
		Scanner s = new Scanner(System.in);
		N=s.nextInt();
		X=s.nextInt();
		int A[] = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
			if(A[i]<X) {
				System.out.println(A[i]);
			}
		}
 
	}
}
