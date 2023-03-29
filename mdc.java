public class mdc {
    public static int MDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MDC(b, a % b);
        }
    }
}
