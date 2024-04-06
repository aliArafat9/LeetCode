public class Solution {
    public int dominantIndex(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                secMax = maxNum;
                maxNum = nums[i];
                maxIndex = i;
            } else if (nums[i] > secMax) {
                secMax = nums[i];
            }
        }
        
        if (maxNum >= 2 * secMax) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}