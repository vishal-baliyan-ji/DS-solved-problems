class Solution {
    public boolean solve(int[] nums,int n,int sum,int target,int[][] dp){
        if(target==sum) {
            return true;
        }
        if(n<0 || sum>target) return false;
        if(dp[n][sum]!=0){
            if(dp[n][sum]==1) return true;
            return false;
        } 
        boolean take=solve(nums,n-1,sum+nums[n],target,dp);
        boolean notTake=solve(nums,n-1,sum,target,dp);
        if(take||notTake){
            dp[n][sum]=1;
        }
        else{
            dp[n][sum]=-1;
        }
        return (dp[n][sum]==1);
    }
    public boolean canPartition(int[] nums) {
        int target=0;
        for(int n:nums){
            target+=n;
        }
        if(target%2==1) return false;
        int[][] dp=new int[nums.length][(target/2)+1] ;
        return solve(nums,nums.length-1,0,target/2,dp);
    }
}