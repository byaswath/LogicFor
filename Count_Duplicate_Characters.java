package logic_For;

public class Count_Duplicate_Characters {

	public static void main(String[] args) {
		String a = "ramkumar";
		char[] ch = a.toCharArray();
		for(int i=0 ; i<ch.length ; i++) {
			int count = 1;
			if(ch[i]=='\0') {
				continue;
			}
			for(int j=i+1 ; j<ch.length ; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='$';
				}
				
			}
			if(count<=1 && ch[i]!='$') {
				System.out.println(ch[i]+":"+count);
			}
			if(count>1 && ch[i]!='$') {
				System.out.println(ch[i]+":"+count);

			}
		}
		
		
		

	}

}
