package controle;

import dominio.ExisteNumeroD;
import java.util.Scanner;

public class ExisteNumeroC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int[] valores = {10, 25, 30, 42, 55, 60, 73, 88, 91, 100};

        ExisteNumeroD dominio = new ExisteNumeroD(valores);

    
        System.out.print("Digite um número para buscar: ");
        int numero = sc.nextInt();

        int posicao = dominio.buscarNumero(numero);

        if (posicao != -1) {
            System.out.println("O número " + numero + " existe no array, na posição " + posicao + ".");
        } else {
            System.out.println("O número " + numero + " não existe no array.");
        }

        sc.close();
    }
}
