package com.patronbuilder.constructores;

public class ConstruirEscuelaArtilleria extends Builder{
    @Override
    public void construirCampamento() {}

    @Override
    public void construirCampoEntrenamiento() {

    }

    @Override
    public void construirEscuelaInfanteria() {

    }

    @Override
    public void construirEscuelaArtilleria() {
        this.edificacion.setEdif1("Escuela de Artillería.");
    }

    @Override
    public void construirAcademiaPilotos() {

    }

    @Override
    public void construirEscuelaMedicina() {
        this.edificacion.setEdif2("Escuela de Medicina.");
    }

    @Override
    public void construirTorreVigilancia() {

    }

    @Override
    public void construirMuralla() {

    }
}
