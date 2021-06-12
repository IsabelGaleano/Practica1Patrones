package com.patronbuilder.constructores;

public class ConstruirCampamento extends Builder {

    public ConstruirCampamento() {}

    public void construirCampamento() {
        this.edificacion.setEdif1("Campamento.");
    }

    public void construirCampoEntrenamiento() {
        this.edificacion.setEdif2("Campo de entrenamiento.");
    }

    public void construirEscuelaInfanteria() {
        this.edificacion.setEdif3("Escuela de infantería.");
    }

    public void construirEscuelaArtilleria() {
        this.edificacion.setEdif4("Escuela de artillería.");
    }

    public void construirAcademiaPilotos() {
        this.edificacion.setEdif5("Academia de pilotos.");
    }

    public void construirEscuelaMedicina() {
        this.edificacion.setEdif6("Escuela de medicina.");
    }

    public void construirTorreVigilancia() {
        this.edificacion.setEdif7("Torre de vigilancia.");
    }

    public void construirMuralla() {
        this.edificacion.setEdif8("Muralla.");
    }
}
