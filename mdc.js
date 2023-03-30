function mdc(a, b) {
    if (b === 0) {
      return a;
    } else {
      return mdc(b, a % b);
    }
  }
  let n1 = parseInt(prompt("Digite o primeiro número:"));
  let n2 = parseInt(prompt("Digite o segundo número:"));
  
  let md = mdc(numero1, numero2);
  console.log("O mdc de " + n1 + " e " + n2 + " é " + md + ".");