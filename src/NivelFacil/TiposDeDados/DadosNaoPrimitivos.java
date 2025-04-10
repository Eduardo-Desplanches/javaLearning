package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
/*Dados não primitivos: String, Array, Class, enum
*
*
* Dados não primitivos conseguem utilizar os dados.*/
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Esse texto esta em CAPSLOCk: " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);

        String  aldeia = "Aldeia da Folha";
        String aldeiaLowerCase  = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
    }
}
