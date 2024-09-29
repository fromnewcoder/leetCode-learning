class Solution {
    public int majorityElement(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
            int maxCount = 0;
            int mjorityNumber = 0;
             int n = nums.length / 2;
            for (int num : nums) {
               int temp =  map.getOrDefault(num, 0) + 1;
             
               if( temp > n){
                  return num;
               }else{
                  map.put(num, temp);
                if(temp > maxCount){
                    maxCount = temp;
                    mjorityNumber = num;
                }
               }
           }
           return mjorityNumber;
    }
}