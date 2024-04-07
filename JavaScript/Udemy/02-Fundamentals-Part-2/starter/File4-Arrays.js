//?  INTRODUCTION TO ARRAY

const friend1 = 'Michael';
const friend2 = 'Steven';
const friend3 = 'Peter';
let friends = ['Michael', 'Steven', 'Peter'];
console.log(friends); // [ 'Michael', 'Steven', 'Peter' ]

const years = new Array(1991, 1984, 2008, 2020);
console.log(friends[0]);
console.log(friends[2]);
console.log(friends.length);
console.log(friends[friends.length - 1]); // It must be an 'EXPRESSION' (string, number, function), not a 'STATEMENT' in []
// console.log(friends[-1]); does not have backward indexing

friends[2] = 'Jay';
console.log(friends); // [ 'Michael', 'Steven', 'Jay' ]

friends = ['Vruti', 'Sakshi'];
console.log(friends);

const firstName = 'Kunjesh';
const jonas = [firstName, 'Ramani', 2037 - 2002, friends];
console.log(jonas);

//^ NOTES
/*

Arrays are non-primitive datatypes, even if you change the value (though, it is a 'const), it will change.
But reassign the whole array again is not possible as it is a 'const'
But you can reassign the whole array using 'let'

*/

//? EXERCISE
const calcAge = function (birthYear) {
    return 2037 - birthYear;
};
const y = [1990, 1967, 2002, 2010, 2018];
console.log(calcAge(y)); // Nan
