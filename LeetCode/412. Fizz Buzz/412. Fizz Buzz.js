var fizzBuzz = function (n) {
  let finalArray = [];

  for (let i = 1; i <= n; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
      finalArray.push("FizzBuzz");
    } else if (i % 5 == 0) {
      finalArray.push("Buzz");
    } else if (i % 3 == 0) {
      finalArray.push("Fizz");
    } else {
      finalArray.push(i.toString());
    }
  }

  return finalArray;
};
