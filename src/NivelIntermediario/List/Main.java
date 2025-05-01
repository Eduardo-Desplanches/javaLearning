package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Array
        * São Estáticos, não alteram de tamanho */
        String[] ninjasArray = new String[3];
        ninjasArray[0] =  "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2]  =  "Sakura";
        System.out.println("Printando o Array = " + ninjasArray);

        /*List - listas
        * Listas não são estáticas, elas podem aumentar ou diminuir*/

        List <String> ninjasList = new ArrayList<>();
       //Adiciona a lista -> add()
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Saruka Haruno");
        ninjasList.add("Hashirama Senju");
        ninjasList.add("Hinata Hyuga");

        System.out.println("ninjasList = " + ninjasList);

        //Remove da lista -> remove()
        ninjasList.remove("Sasuke Uchiha");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos -> set()
        ninjasList.set(2, "Madara Uchira");
        System.out.println("ninjasList = " + ninjasList);

        // Ver o tamanho da Lista -> size()
        System.out.println("Tamanho da lista = " + ninjasList.size() + " elementos");


    }
}
