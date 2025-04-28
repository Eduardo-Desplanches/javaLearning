package NivelIntermediario.Polimorfismo.interfaces;


//As classes FINAL não pode ser extendidas(Herdada), mas pode ser instanciadas.
//Nem tudo é FINAL em uma classe FINAL,isto é, as variáveis e métodos não são obrigatoriamente FINAL
final class Ambu extends Ninja{
    String nome;
    public void ambu(){
        System.out.println("Eu sou um anbu");
    }
}
