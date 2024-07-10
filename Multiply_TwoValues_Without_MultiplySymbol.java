package logic_For;

public class Multiply_TwoValues_Without_MultiplySymbol {

	public static void main(String[] args) {
		String a = "8";
		String b = "5";
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int product = 0;
		
		for(int i=0 ; i<b1 ; i++) {
			product = product+a1;
		}
		System.out.println(product);
		
		

	}

}
