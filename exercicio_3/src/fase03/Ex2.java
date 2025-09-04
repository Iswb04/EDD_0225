package fase03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite um número para procurar: ");
        int busca = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == busca) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado no array.");
        }

        sc.close();
    }
}

