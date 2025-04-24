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

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + ". Essa é minha inteligência de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é gênio" );
        } else if (qi >=130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        }else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar suas estratégias");
        }
    }

    @Override // Convenção/boa prática e para compilação -> previni erros de anotações
    public void metodoProvisorio() {
        System.out.println("Teste, na classe Uchiha");
    }
}
