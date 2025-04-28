package NivelIntermediario.Polimorfismo.interfaces;

public interface EstrategiaDeBatalha {
    //As varíaveis em interfaces são por natureza, padrão FINAL (constante)
    //Já os métodos são implicitamente public
    void estrategiaDeCombate();

    void inteligenciaDeCombate();

    void inteligenciaDeCombate(int qi);
}
