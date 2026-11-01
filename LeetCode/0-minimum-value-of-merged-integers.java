class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i=i+2){
            int len=Integer.toString(nums[i+1]).length();
            int val =(nums[i]*(int) Math.pow(10,len))+nums[i+1];
            min=Math.min(val,min);
        }
        return min;
    }
}