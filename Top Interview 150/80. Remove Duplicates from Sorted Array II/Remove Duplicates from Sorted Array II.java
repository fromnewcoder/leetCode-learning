class Solution {
    //[0,0,1,1,1,1,2,3,3]
    ///[0,0,1,1,2,3,2,3,3]
    public int removeDuplicates(int[] nums) {
    
        if(nums.length == 2){
            return 2;
        }
        
        int count = 0;
        int repeat = 0;

        for(int i = 1;  i < nums.length; i++){
            if(nums[count] != nums[i]){
               count++;
               nums[count] = nums[i];
               repeat = 0;
            }else if(repeat == 0){
                repeat++;
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;

    }
}