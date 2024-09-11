package Loops;

public class Arm {
	public static void main(String[] args) {
		int a=370;
		int CopyofI=a;
		int arm=0;
		while(a>0) {
			int last=a%10;
			arm=last*last*last+arm;
			a=a/10;
			
		}
		System.out.println(arm);
		if(arm==CopyofI) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}

}
