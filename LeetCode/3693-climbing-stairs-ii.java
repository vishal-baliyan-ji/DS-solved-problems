class Solution {
    public int solve(int n, int[] costs,int[] dp){
        if(n==costs.length) return 0;
        if(n>costs.length) return Integer.MAX_VALUE;
        if(dp[n]!=-1) return dp[n];
        int st1=solve(n+1,costs,dp);
        int st2=solve(n+2,costs,dp);
        int st3=solve(n+3,costs,dp);
        if(st1<Integer.MAX_VALUE){
            st1+=1;
            if(n<costs.length){
                st1+=costs[n];
            }
        }
        if(st2<Integer.MAX_VALUE){
            st2+=4;
            if(n+1<costs.length){
                st2+=costs[n+1];
            }
        }
        if(st3<Integer.MAX_VALUE){
            st3+=9;
            if(n+2<costs.length){
                st3+=costs[n+2];
            }
        }
        return dp[n]=Math.min(st1,Math.min(st2,st3));
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[costs.length];
        Arrays.fill(dp,-1);
        return solve(0,costs,dp);
    }
}