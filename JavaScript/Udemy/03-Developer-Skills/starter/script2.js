'use strcit';

function printForecast() {
  let string = '';
  for (let i = 0; i < arr.length; i++) {
    string = string + `... ${arr[i]} C in ${i + 1} days`;
  }
  console.log(string);
}

let arr = [1, 2, 3];
printForecast(arr);
