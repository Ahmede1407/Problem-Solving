class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        evenNums = []
        oddNums = []

        for i in range(len(nums)):
            if nums[i] % 2 == 0:
                evenNums.append(nums[i])
            else:
                oddNums.append(nums[i])

        return evenNums + oddNums
