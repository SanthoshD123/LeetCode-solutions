/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"; // Return the string instead of console.log
    }
};

const f = createHelloWorld();
console.log(f()); // Output: "Hello World"
