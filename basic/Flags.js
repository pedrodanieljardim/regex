// g - global
// i - ignore case
let texto = "Acabei de assinar um contrato!";

console.log(texto.match(/C|ab/));
console.log(texto.match(/c|ab/i));
console.log(texto.match(/c|ab/gi));
