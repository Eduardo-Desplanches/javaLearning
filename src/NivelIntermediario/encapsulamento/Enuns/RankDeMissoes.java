package NivelIntermediario.encapsulamento.Enuns;

//Por natureza o enum herda Enum:
// public enum RankDeMissoes extends Enum
//É usado para coisas certas, ou seja, que não variam e são  já predefinidas
//CADA ENUM TEM APENAS UMA FUNCIONALIDADE
//É usado para enxugar código
//Padrão usar com letra MAIÚSCULAS
//Nada aṕos o ponto e vírgula pode ser um ENUM

public enum RankDeMissoes {
    D("Muito Baixo", 1),
    C("Baixo", 2),
    B("Médio",3),
    A("Alto",4),
    S("Muito Alro",5);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
