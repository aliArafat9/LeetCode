class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] pos = {-1, -1};
        
        pos[0] = search(nums ,target , true );
        pos[1] = search(nums ,target , false );

        return pos ;
       }

    int search(int[] arr , int target ,boolean isStart)
    {
        int ans = -1 ;
        int start = 0 ;
        int end = arr.length - 1 ;
        int  mid = (start+ end) / 2 ;


        while(start <= end)
        {

            mid = (start+ end) / 2 ;

            if(arr[mid] == target) {
                 ans = mid ;
                 if(isStart)
                 {
                    end = mid - 1;
                 }else 
                    start = mid + 1 ;
                 }  
            else if(target < arr[mid])
                {
                    end = mid - 1 ;
                }
                else {
                    start = mid + 1 ;
                }
        }
        return ans ;
    }   
        
}