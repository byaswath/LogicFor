package logic_For;

public class Second_Largest_In_Array {

	public static void main(String[] args) {
		int[] nums = {10,20,30,50,40,50,50};
		int max = 0;
		int secondMax = 0;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==max) {
				continue;
			}
			if(nums[i]>secondMax) {
				secondMax = nums[i];
			}
		}
		System.out.println(secondMax);
		
//		for(int i=0 ; i<nums.length ; i++) {
//			if(nums[i]>max) {
//				secondMax = max ;
//				max = nums[i];
//			}
//			else if(nums[i]>secondMax && nums[i]!=max) {
//				secondMax = nums[i];
//			}
//		}
//		System.out.println(secondMax);
		
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
			for(int j=0 ; j<nums.length ; j++) {
				if(nums[j]==max) {
					continue;
				}
				if(nums[j]>secondMax) {
					secondMax = nums[j];
				}
			}
		}
		System.out.println(secondMax);
		
		
		
		
	}

}
