package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{
//sub classe -> uma classe criada por uma classe mãe, super classe
//Sub classes só podem ter uma super classe (Uma mãe)
//A regra sub classes é super para dizer quais atributos serão instaciados no objeto


    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override  //sobreescrever o método da Classe Ninja
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " +nome+ " e esse é meu ataque Uchiha, um ataque de fogo!");
    }



}
