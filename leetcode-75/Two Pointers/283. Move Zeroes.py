

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        index1 = 0
        for index1 in range(len(nums)):
            if nums[index1] == 0:
                break

        for index2 in range(index1+1, len(nums)):
            if nums[index2] !=0:
                nums[index1] = nums[index2]
                nums[index2] = 0
                index1 = index1 + 1

        return nums

mynum = [1,0,0,3,4,0,4]
s = Solution()
s.moveZeroes(mynum)