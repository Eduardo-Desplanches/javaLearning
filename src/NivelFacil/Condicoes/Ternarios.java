package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*variável = (condição) ? valorSeVerdadeiro : valorSeFalso*/
        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        String teste = (2 == 2)?"Sim":"Não";
        System.out.println(nivelDoNinja);
        System.out.println(teste);
    }
}
