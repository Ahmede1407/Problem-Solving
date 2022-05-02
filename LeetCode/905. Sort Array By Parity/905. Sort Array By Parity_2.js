var sortArrayByParity = function (nums) {
  let evenNums = [];
  let oddNums = [];

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      evenNums.push(nums[i]);
    } else {
      oddNums.push(nums[i]);
    }
  }

  // by using concat() method to combine two arrays
  return (sortedNums = evenNums.concat(oddNums));
};
