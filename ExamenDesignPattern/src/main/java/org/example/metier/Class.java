package org.example.metier;

import org.example.metier.Entites.EntityStrategy;
import org.example.metier.Relation.RelationStrategy;

import java.util.List;

public class Class implements Diagramme{
 private List<EntityStrategy> entityStrategy ;
 private List<RelationStrategy> relationStrategy ;

    public Class(List<EntityStrategy> entityStrategy, List<RelationStrategy> relationStrategy) {
        this.entityStrategy = entityStrategy;
        this.relationStrategy = relationStrategy;
    }

    public List<EntityStrategy> getEntityStrategy() {
        return entityStrategy;
    }

    public void setEntityStrategy(List<EntityStrategy> entityStrategy) {
        this.entityStrategy = entityStrategy;
    }

    public List<RelationStrategy> getRelationStrategy() {
        return relationStrategy;
    }

    public void setRelationStrategy(List<RelationStrategy> relationStrategy) {
        this.relationStrategy = relationStrategy;
    }
}
