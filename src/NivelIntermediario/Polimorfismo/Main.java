package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();


        Hogake Hashirama = new Hogake("Hashirama Senju");
        System.out.println(Hashirama.nome);


        Hogake Tobirama = new Hogake("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hogake Hiruzen = new Hogake(40);
        System.out.println(Hiruzen.idade);

        Hogake Minato = new Hogake("Minato Namikaze", 32, false);
        System.out.println(Minato.idade);

        Hogake Tsunade = new Hogake("Tsunade Senju", 51, true, "Aldeia da folha", 1000, 1000000, 1.63 );
        System.out.println(Tsunade.saldobancario);
    }
}
