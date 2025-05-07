package NivelIntermediario.ArraysXListXStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*Arrays
        * Estáticos -> Ou seja, precisa quanto de espaço de memória será alocado para aponta para os valores através dos índices.
        * Ao printar o array será printado a referência da memória
        * Por ser estático, ele não aumenta ou diminui dinamicamente conforme a necessidade
        * Para printar todo conteudo é necessário um FOR
        * Exigem um tamanho pré definido*/

        System.out.println("---------------------------Array---------------------------------");
        String[] nomeNinjaArray = new String[4];
        nomeNinjaArray[0]= "Naruto Uzumaki";
        nomeNinjaArray[1]= "Sasuke Uchiha";
        nomeNinjaArray[2]= "Sakura Haruno";
        nomeNinjaArray[3]= nomeNinjaArray[2];
        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray = " + nomeNinjaArray[3]);

        /*List
        * Dinâmica -> Ou seja, ela aumenta ou dimunui conforme a necessidade
        * Não se preocupa com memória, alocamento ou deslocamneto de memória funciona automático
        * Lista é um pouco mais lenta em comparação com Array
        * */
        System.out.println("---------------------------List---------------------------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Itachi Uchiha");
        nomeNinjaList.add("Madara Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println("nomeNinjaList = " + nomeNinjaList);

        /*Stack
        *Exigem uma ordem
        * O último a entrar é o primeiro a sair
        * é uma pilha
        * Em stack a lista fica vertical, ou seja, os últimos sempre serão os primeiros a sair, pois está no topo da pilha.
        * Então empilharmos assim como colocamos o livro */

        System.out.println("---------------------------Stack---------------------------------");

        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " + nomeNinjaStack.pop());
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        nomeNinjaStack.push("Itach Uchiha");
        nomeNinjaStack.push("Madara Uchiha");
        nomeNinjaStack.push("Tobirama Senju");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Ninja no topo da Pilha= " + nomeNinjaStack.peek());


    }
}
