package Loops;

public class Alpha {
	public static void main(String[] args) {
		String a="srinath12";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>=98 && ch<=122){
				System.out.println(ch+ "  alphabets");
			}
			else if(ch>=48 && ch<=58) {
				System.out.println(ch+" digits");
			}
		}
		}
	}

