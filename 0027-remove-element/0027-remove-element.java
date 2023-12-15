class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length - 1;
        for(int q=0;q<nums.length;q++){
            if(nums[i]!=val)
                i++;
            else{
                nums[i] = nums[j];
                j--;
            }
        }
        return i;
    }
}