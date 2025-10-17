//Leetcode Problem 1

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(target-nums[i])){
                return new int[]{s.get(target-nums[i]),i};
            }
            else{
                s.put(nums[i],i);
            }
        }
        
        return new int[]{-1,-1};
        
    }
	public static void main(String[] args) {
		int[] arr={12,2,15,7};
		int[] result=twoSum(arr,9);
		for(int i=0;i<result.length;i++){
		    System.out.println(result[i]);
		}
	}
}
