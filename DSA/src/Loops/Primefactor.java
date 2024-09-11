package Loops;

public class Primefactor {
	public static void main(String[] args) {      
		int num=540;
		for(int i=2;i<num;i++) {
			while(num%i==0) {
				System.out.println(i);
				num=num/i;
			
			}
			
		}
		if(num>1) {
			System.out.println(num);
		}
		
		
		
	}

}
