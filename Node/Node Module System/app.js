// global.console.log();

var message = "KUNJESH";
console.log(global.message); // undefined
// Because the 'message' is scoped to this file only(app.js), and not globally
