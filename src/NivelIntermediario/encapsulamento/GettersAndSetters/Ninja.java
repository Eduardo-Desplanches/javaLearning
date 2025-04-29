package NivelIntermediario.encapsulamento.GettersAndSetters;

public abstract class Ninja {
//    public é implicito ao criarmos os atributos
//    private protege os atributos (Traz segurança)
//    Ajuda no CODE Review -> leitura mais lógica do código
//    Padroniza -> todos são forçados a usar GET E SET para alterar os valores dos códigos
//    Get pega o valor do private -> por isso ele RETORNA
//    Set coloca o valor do private -> por isso não retorna e é VOID
//    GETTERS AND SETTERS


   private String nome;
   private String aldeia;
   private int idade;
   private int numeroDeMissoesConcluidas;
   private double altura;

//   tirar dados ou mostrar para o usuario -> Usar GET + NOME DA VARIÁVEL.
//    Setter recebe valor


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
