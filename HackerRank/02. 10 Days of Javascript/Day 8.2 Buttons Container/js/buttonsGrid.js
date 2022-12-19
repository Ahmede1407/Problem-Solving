const btn5 = document.getElementById("btn5");
btn5.addEventListener("click", () => {
  // get all the values from the buttons
  let btnsArray = [
    document.getElementById("btn1").innerText,
    document.getElementById("btn2").innerText,
    document.getElementById("btn3").innerText,
    document.getElementById("btn6").innerText,
    document.getElementById("btn9").innerText,
    document.getElementById("btn8").innerText,
    document.getElementById("btn7").innerText,
    document.getElementById("btn4").innerText,
  ];

  // create new shifted btnsArray
  btnsArray = [
    ...btnsArray.slice(btnsArray.length - 1),
    ...btnsArray.slice(0, btnsArray.length - 1),
  ];

  // assign new values to buttons
  document.getElementById("btn1").innerText = btnsArray[0];
  document.getElementById("btn2").innerText = btnsArray[1];
  document.getElementById("btn3").innerText = btnsArray[2];
  document.getElementById("btn6").innerText = btnsArray[3];
  document.getElementById("btn9").innerText = btnsArray[4];
  document.getElementById("btn8").innerText = btnsArray[5];
  document.getElementById("btn7").innerText = btnsArray[6];
  document.getElementById("btn4").innerText = btnsArray[7];
});
