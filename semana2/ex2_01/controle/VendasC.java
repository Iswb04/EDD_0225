package controle;

import dominio.VendasD;
import java.util.Scanner;

public class VendasC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vendas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": ");
            vendas[i] = sc.nextDouble();
        }

        VendasD dominio = new VendasD(vendas);

        System.out.println("\nLista de vendas:");
        double total = 0;
        for (double v : dominio.listarVendas()) {
            System.out.println("Venda: R$ " + v);
            total += v;
        }

        System.out.println("\nValor total das vendas: R$ " + total);

        sc.close();
    }
}
