class Solution {
    
    public int solve(int[][] nums,int i,int m,int n,int[][][] dp){
        if(i>=nums.length) return 0;
        if(dp[i][m][n]!=-1) return dp[i][m][n];
        
        int take=-1;
        if(m-nums[i][0]>=0 && n-nums[i][1]>=0){
            take=1+solve(nums,i+1,m-nums[i][0],n-nums[i][1],dp);
        }
        int notTake=solve(nums,i+1,m,n,dp);
        dp[i][m][n]=Math.max(take,notTake);
        return dp[i][m][n];
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] nums=new int[strs.length][2];
        int[][][] dp=new int[nums.length][m+1][n+1];
        for(int i =0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                for(int k=0;k<dp[i][j].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        
        for(int i =0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='0'){
                    nums[i][0]+=1;
                }
                else{
                    nums[i][1]+=1;
                }
            }
        }
        
        return solve(nums,0,m,n,dp);
    }
}