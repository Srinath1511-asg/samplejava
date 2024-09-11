package Loops;

import java.util.Scanner;

public class Sumofdigits {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int n=20;
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		
	}
	System.out.println(sum);
}
}
