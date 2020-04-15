package SimplePrgm.org;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Armstrong number");

		for(int n=1;n<=1000;n++) {
			int i=0,j=0;
			int a=n;
			while(a > 0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			if(n==j) {
				
				System.out.println(j);
			}
			
		}
		
	}

}
