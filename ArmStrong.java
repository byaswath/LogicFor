package logic_For;

public class ArmStrong {

	public static void main(String[] args) {
		int a = 153;
		int b = a;
		int c = String.valueOf(a).length();
		int sum = 0;
		for(int i=a ; i!=0 ; i=i/10) {
			int d = i%10;
			sum = sum + d*d*d;
		}
		System.out.println(sum);
		if(sum==b) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not");
		}
		
		
		

	}

}
