package NivelIntermediario;

public class Main {
    public static void main(String[] args) {


/*Pilares da Orientação ao Objeto
* Herença -> usa características de uma classe mãe em classes filhas, otimizando tempo e esforço
* Polimorfismo -> cria uma função única que pode ser utilizada em diferentes classes com diferentes características
* Encapsulamento -> capacidade de proteger classes e variáveis para que não haja vazamento e matendo assim protegida e encapsulada nossos objetos*/


        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto";
        Naruto.idade = 15;
        Naruto.aldeia = "Aldeia da Folha";

        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Aldeia da Folha";


        Sasuke.ShariganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int idadeMinimaHogake = Sasuke.anosParaSeTornarHokage(50);

        System.out.println("Você tem: "+Sasuke.idade+ " então falta no mínimo: " + idadeMinimaHogake + " anos para se tornar um hogake");

        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 15;
        Sakura.aldeia = "Aldeia da Folha";

    }
}
