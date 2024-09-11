package Loops;

public class Gcd {
	public static void main(String[] args) {
		int min=0;
		int max=0;
		int a=9;
		int b=15;
		if(a<b) {
			min=a;
			
		}else {
			max=b;
		}
		int answer=1;
		for (int i = 1; i <=min; i++) {
			if(a%i==0 && b%i==0) {
				answer=i;
			}
		}
		System.out.println(answer);
	}

}
