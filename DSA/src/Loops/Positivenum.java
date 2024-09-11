package Loops;

public class Positivenum {
public static void main(String[] args) {
	int num=1432; 
	int count=0;
	while(num>0){//count positive numbers;
		int last=num%10;
		count++;
		num=num/10;
		
	}
	System.out.println(count);
	
	
}
}
