package NivelIntermediario.Polimorfismo.InterfacesVsClassesAbstratas;

public interface NinjaInterface {
    //Toda vez que for colocado um método na interface, ele será abstrato.
    //Não pode ser setado (definir) depois o valor de atributo. Porque tudo é automaticamente FINAL, ou seja, a definição tem que ser na própria interface.
    //Dessa forma, as maiores diferenças entre classes abstratas e interfaces são que na interface não tem como definir o valor da variável depois e todo método será abstrato.
    //Geralmente, as interfaces são usadas para ter métodos semelhantes sem ter qualquer familiariade entre classes, por exemplo, voar de um pássaro é diferente de um avião,
    //mas no fim das contas é voar apesar de serem de classes diferentes.

    String nome = "Naruto";
    String aldeia = "Aldeia";
    int idade = 16; // Por isso, nunca (Ou pelo menos, raríssima vezes) declaramos uma variável.


    void lancarShuriken(); //tem como reduzir e não colocar public para declarar o método.
}
