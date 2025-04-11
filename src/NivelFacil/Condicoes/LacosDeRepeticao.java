package NivelFacil.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        //While
        //While (condicação) {Tudo aqui vai acontecer}


        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

      /*  while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras" + "Quantidade de clones: " + numeroDeClones);
        }
        
        // for

        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O naruto está se clonando e já se clonou: " + i);
        }*/

        for (int i = 1; i <= 5; i++) {
            System.out.println("Treinando de jutsu número " + i );
            int chakra = 100;

            do {
                System.out.println("Controlando o chakra, energia restante: " + chakra);
                chakra -= 10;
            }while(chakra >= 0);
            System.out.println("Treinamento concluído com sucesso!");
        }


    }
}
