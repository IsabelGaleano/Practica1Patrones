package com.patronbuilder.constructores;

public class ConstruirAcademiaPiloto extends Builder{
    @Override
    public void construirCampamento() {

    }

    @Override
    public void construirCampoEntrenamiento() {

    }

    @Override
    public void construirEscuelaInfanteria() {

    }

    @Override
    public void construirEscuelaArtilleria() {

    }

    @Override
    public void construirAcademiaPilotos() {
        this.edificacion.setEdif1("Academia de Pilotos.");
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
