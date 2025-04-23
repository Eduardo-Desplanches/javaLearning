package NivelIntermediario.Polimorfismo.interfaces;

public class Hatake extends Ninja implements ShariganInterface, AmbuInterface, HogakeInteface{

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void shariganAtivado() {
        System.out.println(nome + ": Sharigan ativado");
    }

    @Override
    public void ninjadeElite() {
        System.out.println(nome + ": Eu sou ninja de Elite da Anbu");
    }

    @Override
    public void hogakeAtivo() {
        System.out.println(nome + ": Eu sou um Hogake");
    }
}
