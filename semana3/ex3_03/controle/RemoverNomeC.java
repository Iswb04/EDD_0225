package controle;

import dominio.RemoverNomeD;
import java.util.Scanner;

public class RemoverNomeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] nomes = {
            "Ana", "Bruno", "Carlos", "Daniela", "Eduardo",
            "Fernanda", "Gabriel", "Helena", "Isabela", "João"
        };

        RemoverNomeD dominio = new RemoverNomeD(nomes);


        System.out.println("Lista inicial:");
        for (String n : nomes) {
            System.out.print(n + " ");
        }

   
        System.out.print("\n\nDigite um nome para remover: ");
        String nome = sc.nextLine();

        boolean removido = dominio.removerNome(nome);

        if (removido) {
            System.out.println("\nNome removido com sucesso!");
        } else {
            System.out.println("\nNome não encontrado na lista.");
        }

   
        System.out.println("\nLista atualizada:");
        for (String n : dominio.getNomes()) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}
