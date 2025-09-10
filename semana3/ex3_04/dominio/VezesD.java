package dominio;

import java.util.HashMap;
import java.util.Map;

public class VezesD {
    private int[] numeros;

    public VezesD(int[] numeros) {
        this.numeros = numeros;
    }

    public Map<Integer, Integer> contarVezes() {
        Map<Integer, Integer> contagem = new HashMap<>();
        for (int n : numeros) {
            contagem.put(n, contagem.getOrDefault(n, 0) + 1);
        }
        return contagem;
    }
}
