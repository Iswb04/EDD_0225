
package testePacote;
import java.util.*;

public class MainLab {

    /* ---------------------------------------------------------
     *  BLOCO A — Collections & List
     * --------------------------------------------------------- */

    // TA1
    public static void TA1() {
        List<Integer> num = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        Collections.sort(num);
        System.out.println("Ordenada: " + num);

        int pos = Collections.binarySearch(num, 8);
        System.out.println("Elemento 8 encontrado na posição: " + pos);

        Collections.reverse(num);
        System.out.println("Reversa: " + num);

        Collections.shuffle(num);
        System.out.println("Embaralhada: " + num);
    }

    // TA2
    public static void TA2() {
        List<String> l1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        List<String> l2 = new ArrayList<>(Arrays.asList("C#", "Java", "Go"));

        Collections.addAll(l1, "Kotlin", "Swift");
        System.out.println("Lista 1 após addAll: " + l1);

        int freq = Collections.frequency(l1, "Java");
        System.out.println("Ocorrências de Java: " + freq);

        boolean disjuntas = Collections.disjoint(l1, l2);
        System.out.println("As listas não têm elementos em comum? " + disjuntas);

        System.out.println("Min l1: " + Collections.min(l1) + ", Max l1: " + Collections.max(l1));
        System.out.println("Min l2: " + Collections.min(l2) + ", Max l2: " + Collections.max(l2));
    }

    /* ---------------------------------------------------------
     *  BLOCO B — Stack (LIFO)
     * --------------------------------------------------------- */

    // TB1 — Verificador de parênteses balanceados
    public static void TB1() {
        String[] entradas = {
            "((2+3)*(4-1))",
            ")(2+3)(",
            "(1+(2*3)"
        };

        for (String expr : entradas) {
            System.out.println(expr + " → " + (balanceada(expr) ? "Balanceada" : "Desbalanceada"));
        }
    }

    public static boolean balanceada(String s) {
        Stack<Character> pilha = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') pilha.push(c);
            else if (c == ')') {
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    // TB2 — Inverter palavra com pilha
    public static void TB2() {
        String palavra = "ALGORITMO";
        Stack<Character> pilha = new Stack<>();

        for (char c : palavra.toCharArray()) pilha.push(c);

        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) invertida.append(pilha.pop());

        System.out.println("Invertida: " + invertida);
    }

    /* ---------------------------------------------------------
     *  BLOCO C — Queue & PriorityQueue
     * --------------------------------------------------------- */

    // TC1 — Fila de impressão
    public static void TC1() {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Doc1");
        fila.offer("Doc2");
        fila.offer("Doc3");
        System.out.println("Fila após inserir 3 docs: " + fila);

        fila.poll();
        fila.poll();
        System.out.println("Após remover 2: " + fila);

        fila.offer("Doc4");
        System.out.println("Após inserir Doc4: " + fila);
    }

    // TC2 — PriorityQueue
    public static void TC2() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(40);

        System.out.println("Peek (menor primeiro): " + pq.peek());

        System.out.print("Removendo em ordem: ");
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
        System.out.println();
    }

    /* ---------------------------------------------------------
     *  BLOCO D — Set & Map
     * --------------------------------------------------------- */

    // TD1 — HashSet / TreeSet
    public static void TD1() {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicata

        System.out.println("HashSet (sem duplicatas): " + set);

        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(10, 5, 8, 1));
        System.out.println("TreeSet ordenado: " + ts);
        System.out.println("headSet(8): " + ts.headSet(8));
        System.out.println("tailSet(8): " + ts.tailSet(8));
    }

    // TD2 — Map / TreeMap
    public static void TD2() {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 90);
        notas.put("Carlos", 80);
        notas.put("Bianca", 85);

        System.out.println("Nota da Ana: " + notas.get("Ana"));
        System.out.println("Keys: " + notas.keySet());
        System.out.println("Size: " + notas.size());

        TreeMap<String, Integer> ordenado = new TreeMap<>(notas);
        System.out.println("TreeMap ordenado: " + ordenado);
    }

    /* ---------------------------------------------------------
     *  BLOCO E — Lista Encadeada & Árvore de Busca
     * --------------------------------------------------------- */

    // E1 — Lista Encadeada
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static class LinkedListSimple {
        Node head;

        void insertAtFront(int val) {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }

        void insertAtBack(int val) {
            Node n = new Node(val);
            if (head == null) { head = n; return; }
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = n;
        }

        void removeFromFront() {
            if (head != null) head = head.next;
        }

        void removeFromBack() {
            if (head == null) return;
            if (head.next == null) { head = null; return; }
            Node temp = head;
            while (temp.next.next != null) temp = temp.next;
            temp.next = null;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void TE1() {
        LinkedListSimple lista = new LinkedListSimple();

        lista.insertAtFront(3);
        lista.insertAtFront(2);
        lista.insertAtBack(4);
        lista.insertAtBack(5);
        lista.insertAtFront(1);

        System.out.print("Lista após inserções: ");
        lista.print();

        lista.removeFromFront();
        lista.removeFromBack();

        System.out.print("Lista após remoções: ");
        lista.print();
    }

    // E2 — BST
    static class BST {
        int val;
        BST left, right;

        BST(int v) { val = v; }

        void insert(int v) {
            if (v < val) {
                if (left == null) left = new BST(v);
                else left.insert(v);
            } else {
                if (right == null) right = new BST(v);
                else right.insert(v);
            }
        }

        void inorder() {
            if (left != null) left.inorder();
            System.out.print(val + " ");
            if (right != null) right.inorder();
        }

        void preorder() {
            System.out.print(val + " ");
            if (left != null) left.preorder();
            if (right != null) right.preorder();
        }

        void postorder() {
            if (left != null) left.postorder();
            if (right != null) right.postorder();
            System.out.print(val + " ");
        }
    }

    public static void TE2() {
        int[] valores = {8,3,10,1,6,14,4,7,13};
        BST root = new BST(8);

        for (int i = 1; i < valores.length; i++) root.insert(valores[i]);

        System.out.print("In-order: ");
        root.inorder(); System.out.println();

        System.out.print("Pre-order: ");
        root.preorder(); System.out.println();

        System.out.print("Post-order: ");
        root.postorder(); System.out.println();
    }

    /* ---------------------------------------------------------
     * MAIN
     * --------------------------------------------------------- */
    public static void main(String[] args) {

        System.out.println("===== TA1 ====="); TA1();
        System.out.println("===== TA2 ====="); TA2();

        System.out.println("===== TB1 ====="); TB1();
        System.out.println("===== TB2 ====="); TB2();

        System.out.println("===== TC1 ====="); TC1();
        System.out.println("===== TC2 ====="); TC2();

        System.out.println("===== TD1 ====="); TD1();
        System.out.println("===== TD2 ====="); TD2();

        System.out.println("===== TE1 ====="); TE1();
        System.out.println("===== TE2 ====="); TE2();
    }
}
