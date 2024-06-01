class Solution {
    public int projectionArea(int[][] grid) {
        int ans=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;

        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    sum1++;
                }
            }
        }

        for(int i=0;i<m;i++){
            int maxx=0;
            for(int j=0;j<n;j++){
                maxx=Math.max(maxx,grid[i][j]);
            }
            sum2+=maxx;
        }

        for(int i=0;i<n;i++){
            int maxx=0;
            for(int j=0;j<m;j++){
                maxx=Math.max(maxx,grid[j][i]);
            }
            sum2+=maxx;
        }
        ans=sum1+sum2+sum3;
        return ans;
    }
}