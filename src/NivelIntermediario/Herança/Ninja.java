package NivelIntermediario.Herança;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    //Criar um método público personalizado
    //método VOID não retorna valor, enquanto outros precisam retornar seu tipo;

    public String EuSouUmNinja(){
        return "Oi, Eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
