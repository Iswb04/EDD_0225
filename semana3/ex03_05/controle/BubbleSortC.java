package controle;

import dominio.BubbleSortD;

public class BubbleSortC {
    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90, 50, 30, 5};

        BubbleSortD dominio = new BubbleSortD(numeros);

        int[] ordenado = dominio.ordenar();

        for (int n : ordenado) {
            System.out.print(n + " ");
        }
    }
}
