package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario) ;
        scanner.close();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("O usuário escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente de novo. ");
        }
    }
}
