package NivelIntermediario.Herança;

public class Main {
    public static void main(String[] args) {


/*Pilares da Orientação ao Objeto
* Herença -> usa características de uma classe mãe em classes filhas, otimizando tempo e esforço
* Polimorfismo -> cria uma função única que pode ser utilizada em diferentes classes com diferentes características
* Encapsulamento -> capacidade de proteger classes e variáveis para que não haja vazamento e matendo assim protegida e encapsulada nossos objetos*/


        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto";
        Naruto.idade = 15;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoSabio();

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Aldeia da Folha";

        Sasuke.ShariganAtivado();
//        String chamandoMetodo = Sasuke.EuSouUmNinja();
//        System.out.println(chamandoMetodo);
//
//        int idadeMinimaHogake = Sasuke.anosParaSeTornarHokage(50);
//
//        System.out.println("Você tem: "+Sasuke.idade+ " então falta no mínimo: " + idadeMinimaHogake + " anos para se tornar um hogake");

        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 15;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.AtivarCurar();


        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.AtivarByakugan();

        Boruto Boruto = new Boruto();

        Boruto.nome = "Boruto Hyuga Uzumaki ";
        Boruto.idade= 14;
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.ModoSabio();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
    }
}
