package SimplePrgm.org;

public class SumEvenOdd {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
	   
		for(int i=1;i<=100;i++) {
			if(i%2==0){
				System.out.println("even:"+i);
               sum=sum+i;	
               
               }
			else {
				System.out.println("Odd num:"+i);
                sum1=sum1+i;
                }
		}
		System.out.println("even num sum: "+sum);
		System.out.println("odd num sum: "+sum1);
	}
	

}
