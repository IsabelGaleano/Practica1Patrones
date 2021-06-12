package com.patronbuilder.constructores;

public class ConstruirCampoEntrenamiendo extends Builder {

    public ConstruirCampoEntrenamiendo() {}

    @Override
    public void construirCampamento() {}

    @Override
    public void construirCampoEntrenamiento() {
        this.edificacion.setEdif1("Campo de entrenamiento.");
    }

    public void construirEscuelaInfanteria() {
        this.edificacion.setEdif2("Escuela de infantería.");
    }

    public void construirEscuelaArtilleria() {
        this.edificacion.setEdif3("Escuela de artillería.");
    }

    @Override
    public void construirAcademiaPilotos() {

    }

    @Override
    public void construirEscuelaMedicina() {
        this.edificacion.setEdif4("Escuela de Medicina.");
    }

    @Override
    public void construirTorreVigilancia() {

    }

    @Override
    public void construirMuralla() {

    }
}
