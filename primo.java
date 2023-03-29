public class primo {
    public static void Primo(int n) {
    boolean num = true;
    if (n <= 1) {
        num = false;
    } else {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                num = false;
                break;
            }
        }
    }
    if (num) {
        System.out.println(n + " é primo.");
    } else {
        System.out.println(n + " não é primo.");
    }
}    
}
