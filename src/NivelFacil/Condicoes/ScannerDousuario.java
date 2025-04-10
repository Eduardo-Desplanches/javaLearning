package Condicoes;

import java.util.Scanner;

public class ScannerDousuario {
    public static void main(String[] args) {
        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva nome do ninja?");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);
        System.out.println("=====================================================");
        System.out.println("Escreva aqui a idade do seu Ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos.");

        /**/
        if(idadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade e, por isso, pode ir para missões fora da aldeia");
        }else {
            System.out.println("O ninja é muito novo para ir em missões fora da aldeia ");
        }
        //Fechar o Scanner
        caixaDeTexto.close();
    }
}
