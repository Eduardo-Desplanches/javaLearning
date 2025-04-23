package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
//    super classe -> pois é classe que dá origem a outra classe, as sub classes.
//    Super classes -> podem ter diversas sub classes.
//    This é a regra de super classe.
    String nome;
    int idade;
    String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }



    // Métodos gerais.
    public void  habilidadeEspecial(){
        System.out.println("Meu nome é " +nome+ " e esse é meu ataque especial.");
    }

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " +nome+". Essa é minha estratégia de combate");
    }

}
