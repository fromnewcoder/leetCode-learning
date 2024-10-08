class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int indexOverall = m + n -1;
      
        if(n==0){
            return;
        }

        for (int i = indexOverall; i >=0 ; i--) {

            if(index1 >= 0 && index2>=0){
                if (nums1[index1] < nums2[index2]){
                    nums1[i] = nums2[index2];
                    index2--;
                }else{
                    nums1[i] = nums1[index1];
                    index1--;
                }
            }else if(index1 >= 0){
                     nums1[i] = nums1[index1];
                    index1--;
            }else if(index2 >= 0){
                      nums1[i] = nums2[index2];
                    index2--;
            }


        }
    }
}