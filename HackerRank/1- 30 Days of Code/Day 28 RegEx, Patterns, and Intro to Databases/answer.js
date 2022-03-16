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
  let N = parseInt(readLine());
  let pattern = new RegExp("@gmail.com");
  let names = [];
  for (let i = 0; i < N; i++) {
    let firstName_temp = readLine().split(" ");
    let firstName = firstName_temp[0];
    let emailID = firstName_temp[1];
    if (pattern.test(emailID)) {
      names.push(firstName);
    }
  }
  names.sort().forEach(function (name) {
    console.log(name);
  });
}
