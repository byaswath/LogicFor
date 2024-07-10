package logic_For;

public class Non_Duplicate_Character {

	public static void main(String[] args) {
		String a = "ramkumar";
		char[] ch = a.toCharArray();
		for(int i=0 ; i<ch.length ; i++) {
			
			boolean isDuplicate = false;
			for(int j=i+1 ; j<ch.length ; j++) {
				if(ch[i]==ch[j]) {
					isDuplicate = true;
					ch[j]='$';
					break;
				}
			}
			if(isDuplicate==false && ch[i]!='$') {
				System.out.println(ch[i]);
			}
		}

	}

}
