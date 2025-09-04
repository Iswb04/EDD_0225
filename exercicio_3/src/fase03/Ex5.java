package fase03;

public class Ex5 {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado com Bubble Sort:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}


// O Bubble Sort é um algoritmo de ordenação bem simples que funciona 
// comparando pares de elementos vizinhos em um array e trocando de lugar
// quando estão na ordem errada.