package logic_For;

public class Count_Digits {

	public static void main(String[] args) {
		int i1 = 480;
		String a = String.valueOf(i1);
		//String str = i1+"";
		//System.out.println(str);
		int count = 0;
		for(int i=0 ; i<a.length() ; i++) {
			if(a.charAt(i)>=0 || a.charAt(i)<=9) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("*******************");
		
		String s = "480";
		int s1 = Integer.parseInt(s);
		int count1 = 0;
		while(s1!=0) {
			count1++;
			s1=s1/10;
		}
		System.out.println(count1);
		int count2 = 0;
		for(int i=i1 ; i!=0 ; i=i/10) {
			
			count2++;
			//i1=i1/10;
		}
		System.out.println(count2);
	}

}
