var romanToInt = function (s) {
  const romanSymbols = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  let total = 0;

  for (let i = 0; i < s.length; i++) {
    let current = romanSymbols[s[i]];
    let next = romanSymbols[s[i + 1]];

    if (current < next) {
      total = total + next - current;
    } else {
      total += current;
    }
  }

  return total;
};
