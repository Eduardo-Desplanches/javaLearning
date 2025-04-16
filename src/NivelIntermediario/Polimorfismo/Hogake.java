package NivelIntermediario.Polimorfismo;

public class Hogake {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldobancario;
    double altura;

    public  Hogake(){
        // construtor vazio, sem argumento = NoARGS Constructor
    }

    //construtor com um argumento
    public Hogake(String nome){
        this.nome = nome;
    }

    public Hogake(int idade){
        this.idade = idade;
    }

//    All args constructor = Construtor com todos argumentos.
    public Hogake(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hogake(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldobancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldobancario = saldobancario;
        this.altura = altura;
    }
}
