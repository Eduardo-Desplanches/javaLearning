package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    int idade;
    String aldeia;

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
