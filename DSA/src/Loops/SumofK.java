package Loops;

public class SumofK {
public static void main(String[] args) {
	int num=50;
	int k=5;
	
	for(int i=1;i<=num;i++) {
		int sum=0;
		int n=i;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		if(sum==k) {
			System.out.println(i);
		}
	}
}
}
