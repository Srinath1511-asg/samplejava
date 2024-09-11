package Loops;

public class Convert {
public static void main(String[] args) {
	String binary="1011";
	int power=0;
	int decimal=0;
	for(int i=binary.length()-1;i>=0;i--) {
		char ch=binary.charAt(i);
		if(ch=='1') {
			decimal+=Math.pow(2,power);
		}
		power++;
	}
	System.out.println(decimal);
	
}
}
