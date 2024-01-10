class Solution {
    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int ans;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        ans = Math.min(cost[n - 1], cost[n - 2]);
        return ans;
    }
}