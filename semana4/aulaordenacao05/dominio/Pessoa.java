package dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Altura: %.2f m", nome, idade, altura);
    }

    /*
     * DETALHAMENTO DO FUNCIONAMENTO DO CÓDIGO:
     *
     * A classe Pessoa representa uma pessoa com três atributos principais: nome, idade e altura.
     * O construtor Pessoa(String nome, int idade, double altura) inicializa esses atributos 
     * ao criar um novo objeto.
     *
     * Os métodos getters (getNome, getIdade e getAltura) permitem acessar os valores dos 
     * atributos de forma controlada, mantendo-os privados para garantir o encapsulamento.
     *
     * O método toString() foi sobrescrito para fornecer uma representação textual legível 
     * do objeto, formatando o nome, idade e altura com duas casas decimais para a altura.
     * Isso permite que, ao imprimir o objeto diretamente, todas as informações relevantes 
     * sejam exibidas de maneira clara e organizada.
     */
}
