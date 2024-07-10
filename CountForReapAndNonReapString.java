package logic_For;

public class CountForReapAndNonReapString {

	public static void main(String[] args) {
		String a = "bottle";
		int count = 0;
		int count1 = 0;
		for(int i=0 ; i<a.length() ; i++) {
			count++;
			for(int j=i+1 ; j<a.length() ; j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count1++;
//					a.charAt(j)='$';
				}
			}
			if(count<=1) {
				System.out.println(a.charAt(i)+"-"+count);
			}
			else {
				System.out.println(a.charAt(i)+"-"+count1);
			}
		}
		
		

	}

}
