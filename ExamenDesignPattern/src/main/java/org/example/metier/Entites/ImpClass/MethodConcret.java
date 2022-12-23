package org.example.metier.Entites.ImpClass;

import java.util.List;

public class MethodConcret {
    private  String Nom;
    private  String TypeReturn;
    private List<Parametre> parametres ;

    public String getNom() {
        return Nom;
    }

    public MethodConcret(String nom, String typeReturn, List<Parametre> parametres) {
        Nom = nom;
        TypeReturn = typeReturn;
        this.parametres = parametres;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public MethodConcret() {
    }

    public String getTypeReturn() {
        return TypeReturn;
    }

    public void setTypeReturn(String typeReturn) {
        TypeReturn = typeReturn;
    }

    public List<Parametre> getParametres() {
        return parametres;
    }

    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }
}
