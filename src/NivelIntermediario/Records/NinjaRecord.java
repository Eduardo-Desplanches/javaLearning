package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone ) {

    /*Todos os atributos SÂO FINAL
    * Records não tem SETTER
    * Usado quando algo é constante, quando muda o valor de algo*/
    public String emailCaixaAlta(){
        return email.toLowerCase();
    }
}
