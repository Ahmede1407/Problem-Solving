var findUnsortedSubarray = function (nums) {
  let len = nums.length - 1,
    left = -1,
    right = -1,
    max = nums[0],
    min = nums[len];
  for (let i = 1; i <= len; i++) {
    let a = nums[i],
      b = nums[len - i];
    a < max ? (right = i) : (max = a);
    b > min ? (left = i) : (min = b);
  }
  return Math.max(0, left + right - len + 1);
};
