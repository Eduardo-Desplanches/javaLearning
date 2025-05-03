package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T>{

    /*
     * Generics
     *
     * Deixa código escalável
     * Facilita manutenção
     * Código reutilizável e genérico*/

    private List<T> equipamentos;


    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "BolsaGenerica " + equipamentos.toString();
    }
}
