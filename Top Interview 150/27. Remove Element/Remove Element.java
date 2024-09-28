class Solution {
    public int removeElement(int[] nums, int val) {

            int end = nums.length - 1;
            int k = 0;
            int r = 0;
            while(end >= 0){
                if(nums[end] == val){
                    nums[end] = nums[nums.length - (k +1)];
                    k++;
                }else{
                    r++;
                }
                end--;

            }
            return r;
    }
}