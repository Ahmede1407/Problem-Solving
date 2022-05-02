var sortArrayByParity = function (nums) {
  let evenNums = [];
  let oddNums = [];

  nums.map((num) => {
    if (num % 2 == 0) {
      evenNums.push(num);
    } else {
      oddNums.push(num);
    }
  });

  // by using spread operator method to combine two arrays
  return (sortedNums = [...evenNums, ...oddNums]);
};
