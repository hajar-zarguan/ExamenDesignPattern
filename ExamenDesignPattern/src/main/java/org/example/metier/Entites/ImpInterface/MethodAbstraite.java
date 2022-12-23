package org.example.metier.Entites.ImpInterface;

import org.example.metier.Entites.ImpClass.Parametre;

import java.util.List;

public class MethodAbstraite {
    private  String Nom;
    private  String TypeReturn;
    private List<Parametre> parametres ;

    public String getNom() {
        return Nom;
    }

    public MethodAbstraite() {
    }

    public MethodAbstraite(String nom, String typeReturn, List<Parametre> parametres) {
        Nom = nom;
        TypeReturn = typeReturn;
        this.parametres = parametres;
    }

    public void setNom(String nom) {
        Nom = nom;
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

