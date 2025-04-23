package NivelIntermediario.Polimorfismo.interfaces;

public class Uchiha extends Ninja implements ShariganInterface{
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void shariganAtivado(){
        System.out.println(nome + ": Ativou o Sharigan.");
    }

    public void ataqueEspecial(){
        System.out.println("Eu sou " + nome + " e esse é meu ataque especial. Eu já completei "  + numeroDeMissoesConcluidas + " e tenho o nível: " + rank);
    }
}
