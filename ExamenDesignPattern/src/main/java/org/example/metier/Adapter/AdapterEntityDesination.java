package org.example.metier.Adapter;

import org.example.metier.Enums.Cardinalite;
import org.example.metier.Entites.EntityStrategy;

public class AdapterEntityDesination implements  AdapterStrategy{
    private EntityStrategy entity ;
    private Cardinalite cardinalites[];

    public AdapterEntityDesination(EntityStrategy entity, Cardinalite[] cardinalites) {
        this.entity = entity;
        this.cardinalites = cardinalites;
    }

    public AdapterEntityDesination() {
    }

    public EntityStrategy getEntity() {
        return entity;
    }

    public void setEntity(EntityStrategy entity) {
        this.entity = entity;
    }

    public Cardinalite[] getCardinalites() {
        return cardinalites;
    }

    public void setCardinalites(Cardinalite[] cardinalites) {
        this.cardinalites = cardinalites;
    }
}
