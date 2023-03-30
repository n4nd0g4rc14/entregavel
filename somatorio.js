var n = prompt("Quantos números serão somados?");
var sum = 0;

for (var p = 1; p <= n; p++) {
  var number = prompt("Digite um número" + p );
  sum += Number(number);
}

console.log("A soma dos " + n + " é igual a: " + sum);