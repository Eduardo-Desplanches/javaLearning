package NivelIntermediario.encapsulamento.Enuns;

public class Main {
    public static void main(String[] args) {

        Missoes missoa1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missoa1.exibirDetalhes();

        Missoes missoes2 = new Missoes("Proteger aldeia da areia", RankDeMissoes.A);
        missoes2.exibirDetalhes();
    }
}
