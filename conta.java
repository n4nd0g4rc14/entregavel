public class conta {
    import java.util.Scanner;

public class CountIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Obtém o primeiro valor e N
        int first = sc.nextInt();
        int n = sc.nextInt();

        // Obtém o menor valor entre o primeiro e N
        int menor = Math.min(first, n);

        // Calcula a diferença entre o menor valor e o primeiro valor
        int diff = menor - first + 1;

        // Imprime o resultado
        System.out.println(diff);

        sc.close();
    }
}

}
