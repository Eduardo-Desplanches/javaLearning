package NivelIntermediario.Polimorfismo.interfaces;

public abstract class Ninja implements EstrategiaDeBatalha {
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

    public void estrategiaDeCombate() {
        System.out.println("Meu nome é: " + nome + ". Essa é minha estratégia de commbate");
    }


    // Sobrecarga de metodo - inteligencia de combate


    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + ". Essa é minha inteligência de combate");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é gênio" );
        } else if (qi >=130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        }else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar suas estratégias");
        }
    }

    public void metodoProvisorio(){
        System.out.println("Teste");
    }
}
