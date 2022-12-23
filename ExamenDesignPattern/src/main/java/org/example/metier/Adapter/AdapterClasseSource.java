package org.example.metier.Adapter;

import org.example.metier.Enums.Cardinalite;
import org.example.metier.Entites.ImpClass.Classe;

public class AdapterClasseSource  implements  AdapterStrategy{
    private Classe classe ;
    private Cardinalite cardinalites[];

    public AdapterClasseSource(Classe classe, Cardinalite[] cardinalites) {
        this.classe = classe;
        this.cardinalites = cardinalites;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Cardinalite[] getCardinalites() {
        return cardinalites;
    }

    public void setCardinalites(Cardinalite[] cardinalites) {
        this.cardinalites = cardinalites;
    }
}
