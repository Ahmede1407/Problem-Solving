function processData(input) {
  //splitting variables
  let inputArray = input.split("\n");
  let returnedDate = inputArray[0].split(" ");
  let dueDate = inputArray[1].split(" ");

  // store days, months, and years
  let day = 0,
    month = 1,
    year = 2,
    fine = 0;

  // check if late or not
  if (returnedDate[year] > dueDate[year]) {
    fine = 10000;
  } else if (returnedDate[month] > dueDate[month]) {
    fine = 500 * (returnedDate[month] - dueDate[month]);
  } else if (returnedDate[day] > dueDate[day]) {
    fine = 15 * (returnedDate[day] - dueDate[day]);
  }

  console.log(fine);
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
  _input += input;
});

process.stdin.on("end", function () {
  processData(_input);
});
