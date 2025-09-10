package dominio;

public class RemoverNomeD {
    private String[] nomes;

    public RemoverNomeD(String[] nomes) {
        this.nomes = nomes;
    }

    public boolean removerNome(String nome) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) { 
                nomes[i] = "---"; 
                return true;      
            }
        }
        return false; 
    }

    public String[] getNomes() {
        return nomes;
    }
}
