public class quick {
    public static void quicksort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(arr, inicio, fim);
            quicksort(arr, inicio, posicaoPivo - 1);
            quicksort(arr, posicaoPivo + 1, fim);
        }
    }
    
    public static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[inicio];
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {
            if (arr[i] <= pivo) {
                i++;
            } else if (arr[f] > pivo) {
                f--;
            } else {
                int troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[inicio] = arr[f];
        arr[f] = pivo;
        return f;
    }    
}
