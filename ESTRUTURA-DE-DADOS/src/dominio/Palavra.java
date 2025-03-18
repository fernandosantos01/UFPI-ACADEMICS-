package dominio;

import java.util.List;

public class Palavra {
    String[] palavra;

    public Palavra(String[] palavra) {
        this.palavra = palavra;
    }

    public String buscarPalavra(String palavra) {
        String palavraBuscada = null;
        for (String p : this.palavra) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraBuscada = p;
            }
        }
        if (palavraBuscada == null) {
            return "não está dentro do Array";
        }
        return palavraBuscada;
    }
}
