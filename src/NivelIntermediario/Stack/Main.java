package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        //São estáticos e tem referência de memória
        String[] ninjasArrays = new String[3];
        ninjasArrays[0]= "Narutp Uzumaki";

        //Listas
        // São dinâmicas e tamanho aumenta e dimunui conforma a necessidade
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        //Stack
        //O último elemento que entrou é obrigatoriamente o primeiro a sair
        // push() -> coloca elemento na pilha
        //Pop() -> tira elemento da pilha no Stack tira o último elemento colocado
        //Peek () -> verifica qual o próximo elemento da pilha
        //size() -> verifica o tamanho da pilha, mostrando a quantidade de elementos

        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha stack atual:" + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha stack atualizada com pop: " + ninjaStack);
        System.out.println("O proxímo elemento da Stack: " + ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos");
        System.out.println("Minha stack atual:" + ninjaStack);
    }
}
