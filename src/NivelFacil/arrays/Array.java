package arrays;



public class Array {
    public static void main(String[] args) {
        //Array são tipos de referência
        String[] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "kakashi Hatake";

        System.out.println(ninjas);
        System.out.println(ninjas[4]);

        ninjas[4] = "Rock Lee";
        System.out.println(ninjas);

        ninjas = new String[4];

        ninjas[0] = "Konohamaru Sarutobi";
        ninjas[1] = "Udon Ise";
        ninjas[2] = "Moegi Kazamatsuri";
        ninjas[3] = "Ebisu";


        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        System.out.println(ninjas);
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        boolean[] verdadeiroOufalso = new boolean[2];
        System.out.println(verdadeiroOufalso[1]);
        System.out.println(verdadeiroOufalso);

        double[] fluantuante = new double[2];
        System.out.println(fluantuante);
        System.out.println(fluantuante[1]);

    }
}
