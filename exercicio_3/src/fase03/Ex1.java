package fase03;

public class Ex1 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 9, 4, 33, 22, 17, 40, 7, 10, 15, 28, 3, 19, 6, 2, 50, 23, 11};

        int pares = 0, impares = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
