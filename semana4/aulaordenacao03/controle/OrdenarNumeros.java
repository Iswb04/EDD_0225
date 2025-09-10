public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ler números do usuário
        int[] numeros = new int[10]; // Array para guardar 10 números

        // Lê 10 números do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordena os números usando Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) { // Se estiver fora de ordem, troca
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostra os números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close(); // Fecha o scanner
    }
}
