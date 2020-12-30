let text = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f";

let regexNew = RegExp('9');

console.log(regexNew.test(text));
console.log(regexNew.exec(regexNew));

const removeCarac = /[a-f]/g;

console.log(text.match(removeCarac));
console.log(text.search(removeCarac));
console.log(text.replace(removeCarac, '1'));

console.log(text.split(removeCarac));