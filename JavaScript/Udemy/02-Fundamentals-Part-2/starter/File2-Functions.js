//? FUNCTIONS

function logger() {
    console.log('My name is Kunjesh');
}
// calling/running/invoking  function
logger(13); // if you add arguments => JS will not take it. Though it will run the function
logger();
logger();
logger();
console.log(logger()); // undefined

function fruitProcessor(apple, orange) {
    // Parameters
    console.log(apple, orange);
    const juice = `Juice with ${apple} apples and ${orange} oranges`;
    return juice;
}

const str = fruitProcessor(5, 10); // Arguments
console.log(str);

// Logging value directly
console.log(fruitProcessor(5, 0));
