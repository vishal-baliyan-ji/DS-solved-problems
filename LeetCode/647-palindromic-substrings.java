class Solution {
    public boolean solve(String s,int i,int j,int[][] dp){
        if(i<=j) return true;
        if(dp[i][j]==1) return true;
        if(dp[i][j]==2) return false;
        if(s.charAt(i)!=s.charAt(j)){
            dp[i][j]=2;
            return false;
        } 
        boolean val=solve(s,i-1,j+1,dp);
        if(val){
            dp[i][j]=1;
        }
        else{
            dp[i][j]=2;
        }
        return val;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        int count=0;
        for(int i =n-1;i>-1;i--){
            for(int j=i;j>-1;j--){
                if(solve(s,i,j,dp)) count++;
            }
        }
        return count;
    }
}