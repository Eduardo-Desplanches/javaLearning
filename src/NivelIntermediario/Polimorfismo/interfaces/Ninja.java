package NivelIntermediario.Polimorfismo.interfaces;

//FINAL serve para não deixar um método ou variavél ser sobrescrito.
public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos:numeroDeMissoesConcluidas, Rank
    //Toda variável por natureza é public
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    double altura;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // final -> deixa uma variável ou método constante, ou seja, não é alterável e precisa passa valor na hora de declarar o atributo.
    // pois ele sempre será mesmo valor.
    final public void jogarKunai(){
        System.out.println("Jogar Kunai.");
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

    public abstract void ataqueEspecial();

}
