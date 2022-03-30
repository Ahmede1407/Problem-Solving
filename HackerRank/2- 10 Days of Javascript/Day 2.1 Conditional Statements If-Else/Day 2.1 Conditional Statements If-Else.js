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

function getGrade(score) {
  let grade;
  // Write your code here
  if (score <= 5) {
    return (grade = "F");
  }
  if (score <= 10 && score > 5) {
    return (grade = "E");
  }
  if (score <= 15 && score > 10) {
    return (grade = "D");
  }
  if (score <= 20 && score > 15) {
    return (grade = "C");
  }
  if (score <= 25 && score > 20) {
    return (grade = "B");
  }
  if (score <= 30) {
    return (grade = "A");
  }

  return grade;
}

function main() {
  const score = +readLine();

  console.log(getGrade(score));
}
