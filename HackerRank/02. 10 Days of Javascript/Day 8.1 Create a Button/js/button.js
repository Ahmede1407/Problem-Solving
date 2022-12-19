let btn = document.getElementById("btn");

btn.addEventListener("click", function (e) {
  let clicks = parseInt(e.currentTarget.innerText, 0) + 1;

  e.currentTarget.innerText = clicks;
});
