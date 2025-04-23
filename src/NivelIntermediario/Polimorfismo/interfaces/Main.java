package NivelIntermediario.Polimorfismo.interfaces;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18 ,1000, NivelNinja.CHUUNIN);

      
        Sasuke.ataqueEspecial();

        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.aldeia = "Aldeia da Folha";
        Kakashi.idade = 40;
        Kakashi.boasVindas();
        Kakashi.shariganAtivado();
        Kakashi.ninjadeElite();
        Kakashi.hogakeAtivo();


        Uchiha Madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 1000, NivelNinja.KAGE);
        Madara.shariganAtivado();
        Madara.ataqueEspecial();
        System.out.println("Nivel Ninja de " + Madara.nome + ": " + Madara.rank);
    }
}
