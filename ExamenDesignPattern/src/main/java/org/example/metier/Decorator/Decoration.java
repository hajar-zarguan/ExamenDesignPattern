package org.example.metier.Decorator;

public class Decoration implements  Contenu{
   private Contenu contenu ;
    public Contenu getContenu() {
        return contenu;
    }
    public Decoration(Contenu contenu) {
        this.contenu = contenu;
    }

    public Decoration() {
    }

    public void setContenu(Contenu contenu) {
        this.contenu = contenu;
    }
}
