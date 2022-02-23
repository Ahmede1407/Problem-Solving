"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (inputStdin) {
  inputString += inputStdin;
});

process.stdin.on("end", function () {
  inputString = inputString.split("\n");

  main();
});

function readLine() {
  return inputString[currentLine++];
}

function main() {
  let n = parseInt(readLine().trim(), 10);

  let currentConsecutive1s = 0;
  let maxConsecuTive1s = 0;

  while (n > 0) {
    let remainder = n % 2;

    if (remainder == 1) {
      currentConsecutive1s += 1;

      if (currentConsecutive1s > maxConsecuTive1s) {
        maxConsecuTive1s = currentConsecutive1s;
      }
    } else {
      currentConsecutive1s = 0;
    }

    n = Math.floor(n / 2);
  }

  console.log(maxConsecuTive1s);
}
