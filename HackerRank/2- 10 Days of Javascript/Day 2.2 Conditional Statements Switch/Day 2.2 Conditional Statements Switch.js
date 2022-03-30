"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

function getLetter(s) {
  let letter;
  // Write your code here

  let firstLetter = s.charAt(0);

  switch (firstLetter) {
    case "a" || "e" || "o" || "i" || "u":
      return (letter = "A");
      break;

    case "b" || "c" || "d" || "f" || "g":
      return (letter = "B");
      break;

    case "h" || "j" || "k" || "l" || "m":
      return (letter = "C");
      break;

    default:
      return (letter = "D");
      break;
  }

  return letter;
}

function main() {
  const s = readLine();

  console.log(getLetter(s));
}
