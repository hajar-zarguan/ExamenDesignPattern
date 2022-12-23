package org.example.metier.Entites.ImpClass;


public class Attribut {
    private String Nom;
    private String Visibilite;
    private String TypeDonnees;
    private Boolean isStatic ;
    private Boolean isFinal;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getVisibilite() {
        return Visibilite;
    }

    public void setVisibilite(String visibilite) {
        Visibilite = visibilite;
    }

    public String getTypeDonnees() {
        return TypeDonnees;
    }

    public void setTypeDonnees(String typeDonnees) {
        TypeDonnees = typeDonnees;
    }

    public Boolean getStatic() {
        return isStatic;
    }

    public void setStatic(Boolean aStatic) {
        isStatic = aStatic;
    }

    public Boolean getFinal() {
        return isFinal;
    }

    public void setFinal(Boolean aFinal) {
        isFinal = aFinal;
    }
}
