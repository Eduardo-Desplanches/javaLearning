package NivelIntermediario.encapsulamento.GettersAndSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------- NARUTO UZUMAKI -----------------------------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16 , 50 , 1.60);
        System.out.println("Meu nome é " + Naruto.getNome());
        Naruto.setNome("Naruto");
        System.out.println("Meu nome é " + Naruto.getNome());
        System.out.println("----------------------------- SASUKE UCHIHA -----------------------------");
    }
}
