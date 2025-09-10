import controle.ControlePessoas;

public class Principal {
    public static void main(String[] args) {
        ControlePessoas controle = new ControlePessoas();
        controle.cadastrarPessoas();
        controle.exibirMenu();

        /*
         * DETALHAMENTO DO FUNCIONAMENTO DO CÓDIGO:
         *
         * A classe Principal é o ponto de entrada do programa. Ela cria um objeto 
         * ControlePessoas, chama cadastrarPessoas() para receber os dados das pessoas
         * e depois exibirMenu() para permitir a ordenação e exibição da lista.
         *
         * Toda a lógica de cadastro, ordenação e exibição está dentro de ControlePessoas; 
         * Principal apenas inicializa e aciona o fluxo principal do programa.
         */
    }
}
