import java.util.LinkedList;
import java.util.Iterator;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Lista original: " + numeros);

        // Remover números pares (usando Iterator para evitar erro de modificação)
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("Após remover pares: " + numeros);
    }
}
