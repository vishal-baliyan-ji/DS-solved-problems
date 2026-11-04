class Solution {
    public boolean solve(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return solve(s,i+1,j-1);
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i =0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(s,i,j)) count++;
            }
        }
        return count;
    }
}