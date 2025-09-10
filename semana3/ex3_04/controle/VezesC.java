package controle;

import dominio.VezesD;
import java.util.Map;

public class VezesC {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 5, 7, 2, 3, 5, 7, 3, 2};

        VezesD dominio = new VezesD(numeros);

        Map<Integer, Integer> resultado = dominio.contarVezes();

        for (Map.Entry<Integer, Integer> entry : resultado.entrySet()) {
            System.out.println("Número " + entry.getKey() + " aparece " + entry.getValue() + " vezes.");
        }
    }
}
