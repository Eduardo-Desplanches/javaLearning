package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    @Override  //sobreescrever o método da Classe Ninja
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " +nome+ " e esse é meu ataque Uchiha, um ataque de fogo!");
    }



}
