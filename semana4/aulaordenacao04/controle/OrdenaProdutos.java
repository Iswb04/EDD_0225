package controle;

import java.util.Scanner;

public class OrdenaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] precos = new double[10];

        System.out.println("Digite o nome e preço de 10 produtos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - i - 1; j++) {
                if (precos[j] < precos[j + 1]) {
                    double tempPreco = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = tempPreco;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " - R$ " + String.format("%.2f", precos[i]));
        }

        scanner.close();

        /*
         * DETALHAMENTO DO FUNCIONAMENTO DO CÓDIGO:
         *
         * O programa cria dois arrays paralelos: 'nomes' para os nomes dos produtos
         * e 'precos' para os preços correspondentes. Ele solicita ao usuário a entrada
         * de 10 produtos, lendo o nome com 'nextLine()' e o preço com 'nextDouble()', 
         * usando 'nextLine()' adicional para limpar o buffer após cada preço.
         *
         * Para ordenar os produtos do mais caro para o mais barato, utiliza-se o Bubble Sort.
         * O algoritmo compara elementos adjacentes do array de preços e, se o da esquerda 
         * for menor, realiza a troca. Simultaneamente, os nomes são trocados para manter 
         * a associação correta entre cada nome e seu preço.
         *
         * Por fim, o programa percorre os arrays e exibe cada produto com seu preço formatado 
         * com duas casas decimais, garantindo uma apresentação organizada.
         */
    }
}
