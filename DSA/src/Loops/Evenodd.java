package Loops;

public class Evenodd {
public static void main(String[] args) {
	int limit=20;
	for (int i = 1; i<=limit; i++) {
		if(i%2==0) {
			System.out.println(i+" even number");
		}
		else {
			System.out.println(i+" odd number");
		}
	}
}
}
