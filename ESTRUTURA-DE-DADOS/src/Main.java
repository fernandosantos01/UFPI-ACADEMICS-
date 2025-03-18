import dominio.Palavra;

public class Main {
    public static void main(String[] args) {
        String[] palavraInseridas = {"Mesa", "Livro", "Penteadeira", "Caderno", "Mouse", "MousePad", "Mouse", "Carregador", "Celular", "Cadeira"};
        Palavra palavra = new Palavra(palavraInseridas);


        System.out.println("A Palavra Procurada: " + palavra.buscarPalavra("Penteadeir"));
        System.out.println("A Palavra Procurada: " + palavra.buscarPalavra("PenteAdeirA"));
    }
}