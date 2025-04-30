package NivelIntermediario.encapsulamento.Enuns;

public class Missoes{
    private String nome;
    private RankDeMissoes rank;

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }

    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " - Rank: " + rank + " - Descrição: " + rank.getDescricao() + " - Nível de dificuldade: " + rank.getDificuldade());
    }
}
