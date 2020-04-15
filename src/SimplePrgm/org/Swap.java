package SimplePrgm.org;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
    int a= s.nextInt();
    int b=s.nextInt();
    //without third variable
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Swapped  num are:");
    System.out.println(a);
    System.out.println(b);
		}
	}
	


