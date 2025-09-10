package dominio;

public class BubbleSortD {
    private int[] numeros;

    public BubbleSortD(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] ordenar() {
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }
}
