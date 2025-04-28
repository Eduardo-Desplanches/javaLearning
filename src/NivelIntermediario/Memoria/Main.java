package NivelIntermediario.Memoria;

public class Main {
    public static void main(String[] args) {


       // o @ é objeto referência da memória
        // Ao printar um objeto sem metódo ou propriedade, vemos a referência da memória, se quisermos algo em específico temos que ser especificos
        // para assim encontramos o valor da memória.
        //É possível transformar a referência de memória em valor de memória através do toString().
        System.out.println("---------------------------------- Naruto Uzumaki ---------------------------------- ");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        System.out.println(Naruto.toString());

        System.out.println("---------------------------------- Sasuke Uchiha ---------------------------------- ");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16);
        System.out.println(Sasuke.toString());




    }
}
