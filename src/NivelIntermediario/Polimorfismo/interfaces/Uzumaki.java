package NivelIntermediario.Polimorfismo.interfaces;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }
    /*this-> Dessa classe que trabalhamos
    * super -> Da classe que é herdada*/

    @Override
    public void ataqueEspecial() {
        System.out.println("Eu sou " + nome + " e esse é meu ataque especial. Eu já completei "  + numeroDeMissoesConcluidas + " missões e tenho o nível: " + rank);
    }

    @Override
    public String toString() {
        return "Uzumaki:" +
                "\nbiju = " + biju +
                ", \nnome = '" + nome + '\'' +
                ", \naldeia = '" + aldeia + '\'' +
                ", \nidade = " + idade +
                ", \nnumeroDeMissoesConcluidas = " + numeroDeMissoesConcluidas +
                ", \nrank = " + rank +
                ", \naltura = " + altura
                ;
    }
}
