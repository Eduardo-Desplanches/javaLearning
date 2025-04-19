package NivelIntermediario.Polimorfismo.InterfacesVsClassesAbstratas;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

//    Métodos abstratos -> não possuem corpo da função, ou seja, ele apenas declarado
    public abstract void nomeDoNinja();

    public void lancarKunai(){
        System.out.println("Eu lancei uma kunai.");
    }
}
