//Two Sum - Pair with Given Sum
import java.util.*;
public class TwoSumGfG {
    static boolean twoSum(int nums[], int target) {
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(target-nums[i])){
                return true;
            }
            else{
                s.put(nums[i],i);
            }
        }
        
        return false;
        
    }
    public static void main(String[] args) {
		int[] arr={12,2,15,7};
		System.out.println(twoSum(arr,9));
		
	}
}
