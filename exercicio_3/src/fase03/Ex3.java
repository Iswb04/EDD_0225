package fase03;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite um nome para remover: ");
        String remover = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(remover)) {
                nomes[i] = "---";
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado.");
        }

        System.out.println("Array atualizado:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        sc.close();
    }
}

