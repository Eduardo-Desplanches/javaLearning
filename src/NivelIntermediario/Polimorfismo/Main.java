package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //Obj Naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();

        Uchiha Itachi = new Uchiha("Itachi", 27, "Aldeia da folha" );
        Itachi.estrategiaDeBatalhaNinja();


        Hogake Hashirama = new Hogake("Hashirama Senju", 45, true, "Aldeia da folha", 1000, 1000000, 1.80 );
        System.out.println(Hashirama.saldobancario);
    }
}
