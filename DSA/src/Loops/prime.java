package Loops;

public class prime {
	public static void main(String[] args) {
		int limit=30;
		
		for(int i=1;i<=limit;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
				count++;           // it is like count=count+1;
					
				}
			}
			if(count==2) {
				System.out.println(i+" is a prime number");
			}
			else {
				System.out.println(i+" not a prime number");
			}
		}
	}

}
