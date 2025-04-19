package NivelIntermediario.Polimorfismo.InterfacesVsClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        // Classe abstrata serve para organizar código e proteger as classes que não devem ser usadas.
    //Classes abstratas permitem que você defina métodos concretos e abstratos,
        // enquanto interfaces só permitem a declaração de métodos (até o Java 8, quando foram introduzidos métodos default).
        Uzumaki Naruto = new Uzumaki();
        Naruto.lancarShuriken();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome  = "Sasuke";

        Sasuke.nomeDoNinja();
    }
}
