public class fibonacci {
public static int fibo(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
        return fibo(n-1) + fibo(n-2);
    }
}
}