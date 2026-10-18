class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int i=0;
        int j=0;
        int[] ans=new int[2];
        while(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!='V'){
            if(grid[i][j]=='L'){
                grid[i][j]='V';
                ans[0]=i;
                ans[1]=j;
                j--;
            }
            else if(grid[i][j]=='R'){
                grid[i][j]='V';
                ans[0]=i;
                ans[1]=j;
                j++;
            }
            else if(grid[i][j]=='U'){
                grid[i][j]='V';
                ans[0]=i;
                ans[1]=j;
                i--;
            }
            else if(grid[i][j]=='D'){
                grid[i][j]='V';
                ans[0]=i;
                ans[1]=j;
                i++;
            }
            
        }
        return ans;
    }
}