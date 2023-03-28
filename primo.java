public class primo {
    public static void Primo(int n) {
    boolean isPrime = true;
    if (n <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println(n + " é um número primo.");
    } else {
        System.out.println(n + " não é um número primo.");
    }
}    
}
