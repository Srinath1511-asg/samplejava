package Loops;

public class Lcm {
public static void main(String[] args) {
	int a=10;
	int b=15;                //lcm=a*b/gcd;
int lcm=0;
        int g=0;
        for(int i=1;i<=50;i++) {
        	if(a%i==0 && b%i==0) {
        		g=i;
        	}
        }
        lcm=a*b/g;
        System.out.println("Lcm of a and b is "+lcm);
}
}
