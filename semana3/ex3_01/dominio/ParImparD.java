package dominio;

public class ParImparD {
    private int[] valores;

    public ParImparD(int[] valores) {
        this.valores = valores;
    }

    public int contarPares() {
        int pares = 0;
        for (int n : valores) {
            if (n % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public int contarImpares() {
        int impares = 0;
        for (int n : valores) {
            if (n % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }
}
