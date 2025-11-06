import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();

        // Visitando páginas
        historico.push("google.com");
        historico.push("youtube.com");
        historico.push("github.com");

        System.out.println("Histórico atual: " + historico);

        // Voltar uma página
        String paginaAnterior = historico.pop();
        System.out.println("Voltando de: " + paginaAnterior);
        System.out.println("Página atual: " + historico.peek());

        // Avançar
        historico.push("stackoverflow.com");
        System.out.println("Nova página: " + historico.peek());
    }
}
