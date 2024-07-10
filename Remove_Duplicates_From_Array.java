package logic_For;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Remove_Duplicates_From_Array {

	public static void main(String[] args) {
		
		FindDuplicate fd = new FindDuplicate();
		int[] nums = {1,2,2,3,3,4};
		System.out.println(fd.getDuplicate(nums));
		
		
//		int[] nums = {1,2,2,3,3,4};
//		for(int i=0 ; i<nums.length ; i++) {
//			boolean isDuplicate = false;
//			for(int j=i+1 ; j<nums.length ; j++) {
//				if(nums[i]==nums[j]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//			if(isDuplicate==false) {
//			System.out.println(nums[i]);
//			}
//
//		}


	}
}

class FindDuplicate {
	public ArrayList<Integer> getDuplicate(int[] a) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0 ; i<a.length ; i++) {
			boolean isDuplicate = false;
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]==a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate==false) {
			al.add(a[i]);
			}

		}
		return al;
	}
}
