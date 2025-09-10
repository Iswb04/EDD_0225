package controle;

import dominio.Pessoa;
import java.util.Scanner;

public class ControlePessoas {
    private Pessoa[] pessoas;
    private Scanner scanner;

    public ControlePessoas() {
        pessoas = new Pessoa[5];
        scanner = new Scanner(System.in);
    }

    public void cadastrarPessoas() {
        System.out.println("Cadastro de 5 pessoas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); 
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
    }

    public void exibirMenu() {
        System.out.println("\nEscolha o tipo de ordenação:");
        System.out.println("1 - Ordem alfabética (nome)");
        System.out.println("2 - Ordem crescente de idade");
        System.out.println("3 - Ordem crescente de altura");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                ordenarPorNome();
                break;
            case 2:
                ordenarPorIdade();
                break;
            case 3:
                ordenarPorAltura();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        listarPessoas();
    }

    private void ordenarPorNome() {
        for (int i = 0; i < pessoas.length - 1; i++) {
            for (int j = 0; j < pessoas.length - i - 1; j++) {
                if (pessoas[j].getNome().compareToIgnoreCase(pessoas[j + 1].getNome()) > 0) {
                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    private void ordenarPorIdade() {
        for (int i = 0; i < pessoas.length - 1; i++) {
            for (int j = 0; j < pessoas.length - i - 1; j++) {
                if (pessoas[j].getIdade() > pessoas[j + 1].getIdade()) {
                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    private void ordenarPorAltura() {
        for (int i = 0; i < pessoas.length - 1; i++) {
            for (int j = 0; j < pessoas.length - i - 1; j++) {
                if (pessoas[j].getAltura() > pessoas[j + 1].getAltura()) {
                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }
    }

    private void listarPessoas() {
        System.out.println("\nLista de Pessoas:");
        for (Pessoa p : pessoas) {
            System.out.println(p); 
        }
    }

    /*
     * DETALHAMENTO DO FUNCIONAMENTO DO CÓDIGO:
     *
     * O programa gerencia o cadastro e ordenação de um conjunto de 5 pessoas, 
     * utilizando um array de objetos do tipo Pessoa e um Scanner para entrada de dados.
     *
     * 1. O método cadastrarPessoas() solicita que o usuário digite o nome, idade 
     *    e altura de cada pessoa. Os dados são armazenados em objetos Pessoa, 
     *    que são inseridos no array 'pessoas'. A quebra de linha após a leitura de 
     *    números é consumida para evitar problemas na leitura do próximo nome.
     *
     * 2. O método exibirMenu() apresenta três opções de ordenação: por nome (alfabética), 
     *    por idade (crescente) e por altura (crescente). Dependendo da escolha do usuário, 
     *    ele chama o método de ordenação correspondente e, em seguida, lista todas as pessoas.
     *
     * 3. Os métodos ordenarPorNome(), ordenarPorIdade() e ordenarPorAltura() utilizam 
     *    o algoritmo Bubble Sort para reorganizar os elementos do array. Cada método compara 
     *    os valores correspondentes de cada Pessoa (nome, idade ou altura) e troca de posição 
     *    caso estejam fora da ordem desejada, garantindo que o array fique ordenado corretamente.
     *
     * 4. O método listarPessoas() percorre o array e imprime cada pessoa na tela, 
     *    utilizando o método toString() da classe Pessoa para apresentar os dados de forma legível.
     *
     * O programa mantém a associação correta entre os atributos de cada pessoa, 
     * permite diferentes critérios de ordenação e exibe os resultados de maneira organizada.
     */
}
