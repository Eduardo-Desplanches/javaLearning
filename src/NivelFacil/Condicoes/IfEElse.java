package NivelFacil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        //Ninja
        String nome = "Naruto";
        int idade = 30;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String rank;

        if (numeroDeMissoes > 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if(numeroDeMissoes >= 20 && idade > 20){
            System.out.println("Rank: Jonin");
        }else {
            System.out.println("Rank: Genin");
        }

    }
}
