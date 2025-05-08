package NivelIntermediario.Queue;

import java.util.LinkedList;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*Queue -> FILA
         * FIFO -> First in First Out -> Primeiro entra, primeiro sai
         * Head -> cabeça -> primeiro
         * Tail -> cauda -> último
         * Poll() -> tira o Head, o primeiro da fila
         * Peek() -> vê o head, primeiro da fila
         * Diferente do Stack, o método push não funciona aqui, precisa ser add() para adicionar algo a fila.
         * Não dá para retirar o tail, o último, até sair todos os que estão na frente na QUEUE, fila
         * Offer() -> adiciona algo a fila se for possível, dependedo de como for instanciado Queue a Fila pode ter um limite, não acontece LinkedList, mas ArrayBlockingQueue é limitado uso de espaço como na Array.
         * Verifica se a fila está vazia -> isEmpty() */


        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        System.out.println("Ninjas na fila: " + ninjasQueue);

        ninjasQueue.poll();

        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");

        System.out.println("Ninja do Head: " + ninjasQueue.peek());

        System.out.println("Ninjas na fila: " + ninjasQueue);

        System.out.println(ninjasQueue.offer("Tobirama Senju"));

        /*Esvaziar a fila*/

        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);

        /**/
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia");
        }




    }
}
