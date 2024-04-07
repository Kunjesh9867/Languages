//? FUNCTION DECLARATION VS EXPRESSIONS

//^ Function declaration
// You can call the function before declaration
function calcAge1(birthYear) {
    return 2037 - birthYear;
}

const age1 = calcAge1(1991);

//^ Function expression
// You cannot call the function before declaration
const calcAge2 = function (birthYear) {
    // anonymous function
    return 2037 - birthYear;
};

const age2 = calcAge2(1991);
console.log(age1, age2);

//^ Arrow Function[ES6]
// (Special form of function Expression)

const calcAge3 = (birthYear) => 2037 - birthYear; // 1 statement = no return
// () are mandatory

console.log(calcAge3(1991));

const yearsUntilRetirement = (birthYear, firstName) => {
    // multiple statement = return is required
    const age = 2023 - birthYear;
    const retirement = 65 - age;
    return `${firstName}, years left for retirement is: ${retirement}`;
};
console.log(yearsUntilRetirement(2002, 'Kunjesh'));


//? FUNCTION CALLING ANOTHER FUNCTION = You know it already
// Without the () = function is just a value.
// Eg.  fruitProcessor [just a value]

