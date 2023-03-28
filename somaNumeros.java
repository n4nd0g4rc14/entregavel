public class somaNumeros {
    public static int Soma (int... numeros) { 
    int soma = 0;
    for (int numero : numeros) {
        soma += numero;
    }
    return soma;
}
}