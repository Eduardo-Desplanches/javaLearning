package NivelIntermediario.Polimorfismo.interfaces;

public abstract class Ninja {
    //TODO: Incluir 2 novos atributos:numeroDeMissoesConcluidas, Rank
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    //TODO: Sobrecarga do construtor chamado os novos atributos
}
