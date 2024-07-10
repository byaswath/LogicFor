package logic_For;

public class Integer_Palindrome {

	public static void main(String[] args) {
		int a = 404;
		int original = a;
		int b = 0;
//		while(a!=0) {
//			int lastDigit = a%10;
//			b = b*10 + lastDigit;
//			a /= 10;
//		}
		for(int i=0 ; i<a ; i++) {
			int lastDigi = a%10;
			b = b*10 + lastDigi;
			a = a/10;
		}	
		System.out.println(b);
		
//		for(int i=a ; i!=0 ; i=i/10) {
//			int lastDigi = i%10;
//			b = b*10 + lastDigi;
//		}	
//		System.out.println(b);
		
		
		if(original==b) {
			System.out.println(original+" is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		

	}

}
