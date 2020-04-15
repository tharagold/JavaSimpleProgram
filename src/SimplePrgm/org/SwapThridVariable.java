package SimplePrgm.org;

import java.util.Scanner;

public class SwapThridVariable {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
    int a= s.nextInt();
    int b=s.nextInt();
    int c;
    //with third variable
    c=a;
    a=b;
    b=c;
    System.out.println("Swapped  num are:");
    System.out.println(a);
    System.out.println(b);
		}
	}

