package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 999999);
        System.out.println("cadastro = " + cadastro);
        System.out.println("Nome do cadastro = " + cadastro.getNome());



        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 88888);
        System.out.println("cadastroRecord = " + cadastroRecord.emailCaixaAlta());
        System.out.println("cadastroRecord = " + cadastroRecord.nome());

    }
}
