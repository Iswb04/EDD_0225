package fase03;

public class Ex4 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 5, 2, 7, 3, 2, 2, 9, 5};
        int[] contagem = new int[numeros.length];
        boolean[] contado = new boolean[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            if (!contado[i]) {
                int count = 1;
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        count++;
                        contado[j] = true;
                    }
                }
                contagem[i] = count;
                System.out.println(numeros[i] + " aparece " + count + " vez(es).");
            }
        }
    }
}

