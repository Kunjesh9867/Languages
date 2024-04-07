function percentageOfWorld1(population) {
    return (population / 7900) * 100;
}
// console.log(percentageOfWorld1(1000));
// console.log(percentageOfWorld1(10000));
// console.log(percentageOfWorld1(1441));

// console.log();

// let percentageOfWorld2 = function (population) {
//     return (population / 7900) * 100;
// }
// console.log(percentageOfWorld2(1000));
// console.log(percentageOfWorld2(10000));
// console.log(percentageOfWorld2(1441));

// console.log();

// let percentageOfWorld3 = (population) => {
//     return (population / 7900) * 100;
// }
// console.log(percentageOfWorld3(1000));
// console.log(percentageOfWorld3(10000));
// console.log(percentageOfWorld3(1441));

function describePopulation(country, population) {
    return `${country} has ${population} million people, which is about ${percentageOfWorld1(
        population
    )} of the world`;
}


console.log(describePopulation('India', 1500));
