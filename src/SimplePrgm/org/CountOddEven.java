package SimplePrgm.org;

public class CountOddEven {
	
	public static void main(String[] args) {
		int count=0;
		int count1=0;
	   
		for(int i=1;i<=100;i++) {
			if(i%2==0){
				System.out.println("even:"+i);
				count++;
							}
			else {
				System.out.println("Odd num:"+i);
				count1++;
			}
		}
		System.out.println("even num count: "+count);
		System.out.println("odd num count: "+count1);
	}
	
}

