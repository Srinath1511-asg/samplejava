package Loops;

public class Division {
public static void main(String[] args) {
	int num=100;
	for(int i=1;i<=num;i++) {
		if(i%5==0 && i%11==0) {
			System.out.println(i+" it is devisible by both 5 and 11");
		}
	}
}
}
