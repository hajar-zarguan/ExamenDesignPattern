package org.example.metier;

import java.util.List;

public class ModelUML {
    private String Title ;
    private List<Diagramme> diagrammes ;

    public ModelUML() {
    }

    public ModelUML(String title, List<Diagramme> diagrammes) {
        Title = title;
        this.diagrammes = diagrammes;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<Diagramme> getDiagrammes() {
        return diagrammes;
    }

    public void setDiagrammes(List<Diagramme> diagrammes) {
        this.diagrammes = diagrammes;
    }
}
