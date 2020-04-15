package SimplePrgm.org;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//int n,i=0,j=0;
		//Scanner s=new Scanner(System.in);
		//n=s.nextInt();
		for(int n=1;n<=100;n++) {
		int i=0,j=0;	
		int a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j) {
			System.out.println(j);
		
		//else {
			//System.out.println("not palindrome");
		}
		}
	}
}
