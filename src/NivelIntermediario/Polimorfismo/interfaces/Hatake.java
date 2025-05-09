package NivelIntermediario.Polimorfismo.interfaces;

public class Hatake extends Ninja implements ShariganInterface, AmbuInterface, HogakeInteface{


    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void shariganAtivado() {
        System.out.println(nome + ": Sharigan ativado");
    }

    @Override
    public void ninjadeElite() {
        System.out.println(nome + ": Eu sou ninja de Elite da Anbu");
    }

    @Override
    public void hogakeAtivo() {
        System.out.println(nome + ": Eu sou um Hogake");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Eu sou " + nome + " e esse é meu ataque especial. Eu já completei "  + numeroDeMissoesConcluidas + " missões e tenho o nível: " + rank);
    }
}
