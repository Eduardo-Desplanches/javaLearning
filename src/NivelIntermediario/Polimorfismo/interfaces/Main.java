package NivelIntermediario.Polimorfismo.interfaces;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------- Sasuke Uchiha ---------------------------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18 ,20, NivelNinja.CHUUNIN);
        Sasuke.ataqueEspecial();

        System.out.println("--------------------------- Kakashi Hatake ---------------------------");

        Hatake Kakashi = new Hatake("Kakashi Hatake",  "Aldeia da Folha", 40, 500, NivelNinja.JOUNIN);
        Kakashi.boasVindas();
        System.out.println("-------------------------------------------------------");
        Kakashi.shariganAtivado();
        System.out.println("-------------------------------------------------------");
        Kakashi.ninjadeElite();
        System.out.println("-------------------------------------------------------");
        Kakashi.hogakeAtivo();
        System.out.println("-------------------------------------------------------");

        System.out.println("--------------------------- Madara Uchiha ---------------------------");

        Uchiha Madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 1000, NivelNinja.KAGE);
        Madara.shariganAtivado();
        Madara.ataqueEspecial();
        System.out.println("Nivel Ninja de " + Madara.nome + ": " + Madara.rank);
        Madara.inteligenciaDeCombate(200);
        Madara.inteligenciaDeCombate();
        System.out.println("--------------------------- Naruto Uzumaki ---------------------------");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha",18, 20, NivelNinja.CHUUNIN, Biju.KURAMA);
        Naruto.jogarKunai();
        System.out.println(Naruto.toString());
    }
}
