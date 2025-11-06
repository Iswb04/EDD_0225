import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        int n = 100_000;

        // Teste com ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i); // inserção no início
        }
        long fimArray = System.currentTimeMillis();
        System.out.println("ArrayList -> Tempo: " + (fimArray - inicioArray) + " ms");

        // Teste com LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long inicioLinked = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        long fimLinked = System.currentTimeMillis();
        System.out.println("LinkedList -> Tempo: " + (fimLinked - inicioLinked) + " ms");
    }
}
