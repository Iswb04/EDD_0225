import java.util.LinkedList;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando clientes na fila
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Daniela");

        System.out.println("Fila inicial: " + fila);

        // Atendendo clientes
        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.poll()); // poll remove o primeiro da fila
            System.out.println("Fila atual: " + fila);
        }
    }
}
