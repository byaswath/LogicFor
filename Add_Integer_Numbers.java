package logic_For;

public class Add_Integer_Numbers {

	public static void main(String[] args) {
		System.out.println("**************");
		String a = "2356";
		int sum = 0;
		for(int i=0 ; i<a.length() ; i++) {
			int lastDigit = a.charAt(a.length()-1)%10;
			sum += lastDigit;
			lastDigit = a.charAt(a.length()-1)/10;
		}
		System.out.println(sum);
		System.out.println("**************");
		String s = "2356";
		int i1 = Integer.parseInt(s);
		int sum1 = 0;
		while(i1>0) {
			int lastDigi = i1%10;
			sum1 += lastDigi;
			i1 = i1/10;
		}
		System.out.println(sum1);
		System.out.println("******For********");
		
		String str = "2356";
		int lenStr = str.length();
		int b = Integer.parseInt(str);
		int sumStr = 0;
		for(int i=b ; i!=0 ; i--) {
			int lastDigit = b%10;
			sumStr += lastDigit;
			b = b/10;
		}
		System.out.println(sumStr);

	}

}
