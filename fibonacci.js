function fibonacci(n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
  var n = prompt("Digite um número: ");
  var fib = fibonacci(n);
  console.log("O " + n + " na Fibonacci é: " + fib);