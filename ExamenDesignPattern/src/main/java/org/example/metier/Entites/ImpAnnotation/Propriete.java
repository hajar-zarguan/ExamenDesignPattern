package org.example.metier.Entites.ImpAnnotation;

public class Propriete {
    public  String Nom;

    public Propriete(String nom) {
        Nom = nom;
    }

    public Propriete() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
