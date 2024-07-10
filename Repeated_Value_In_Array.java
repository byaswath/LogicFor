package logic_For;

public class Repeated_Value_In_Array {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,5,3};
		for(int i=0 ; i<nums.length ; i++) {
			boolean isPresent = false;
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[i]==nums[j]) {
					isPresent = true;
					nums[j]='$';
					
				}
			}
			if(isPresent==true && nums[i]!='$') {
				System.out.println(nums[i]);
			}
		}
		

	}

}
