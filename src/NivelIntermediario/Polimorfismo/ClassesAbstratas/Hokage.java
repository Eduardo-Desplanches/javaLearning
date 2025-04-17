package NivelIntermediario.Polimorfismo.ClassesAbstratas;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldobancario;
    double altura;

    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldobancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldobancario = saldobancario;
        this.altura = altura;
    }

    public Hokage() {
    }

    public abstract void sabedoriaHogake();
}
