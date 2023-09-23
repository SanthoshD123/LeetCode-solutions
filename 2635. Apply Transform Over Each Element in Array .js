/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
  const result = [];

  for (let i = 0; i < arr.length; i++) {
    result.push(fn(arr[i], i));
  }

  return result;
};

// Example 1:
const arr1 = [1, 2, 3];
const fn1 = function plusone(n) {
  return n + 1;
};
const newArray1 = map(arr1, fn1); // [2, 3, 4]
console.log(newArray1);

// Example 2:
const arr2 = [1, 2, 3];
const fn2 = function plusI(n, i) {
  return n + i;
};
const newArray2 = map(arr2, fn2); // [1, 3, 5]
console.log(newArray2);

// Example 3:
const arr3 = [10, 20, 30];
const fn3 = function constant() {
  return 42;
};
const newArray3 = map(arr3, fn3); // [42, 42, 42]
console.log(newArray3);
