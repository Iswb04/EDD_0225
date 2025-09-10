package controle;

import dominio.ParImparD;

public class ParImparC {
	
    public static void main(String[] args) {  // main || view
        int[] valores = {1, 2, 3, 4, 5, 6};

        ParImparD dominio = new ParImparD(valores);

        System.out.println("Quantidade de pares: " + dominio.contarPares());
        System.out.println("Quantidade de ímpares: " + dominio.contarImpares());
    }
}
