class Solution {
    public int largestPerimeter(int[] nums) {
 Arrays.sort(nums);
 
    for(int i=nums.length-1;i>1;i--){
        int a = nums[i-2];
        int b = nums[i-1];
        int c = nums[i];
		
		//sum of all the sides
			int s = a + b + c;
        
		//condition for triangle
        if(a+b>c)
		{
            return s;
        }
    }

    return 0;
      
}
}