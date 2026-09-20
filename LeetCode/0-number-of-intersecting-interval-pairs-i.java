class Solution {
    public int countIntersectingIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b)-> Integer.compare(a[0],b[0]));
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int check=nums[i][1];
            for(int j=i+1;j<nums.length;j++){
                if(check>=nums[j][0]) count++;
            }
        }
        return count;
    }
}