package Loops;

public class Powerof2 {
	public static void main(String[] args) {
		int num=49
				;
		int i=1;
		int answer=1;
		while(i*i<=num) {
			answer=i;
			i=i+1;
		}
		System.out.println(answer);
	}

}
