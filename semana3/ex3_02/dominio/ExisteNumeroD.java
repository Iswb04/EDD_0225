package dominio;

public class ExisteNumeroD {
    private int[] valores;

    public ExisteNumeroD(int[] valores) {
        this.valores = valores;
    }

    public int buscarNumero(int numero) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == numero) {
                return i; 
            }
        }
        return -1; 
    }
}
