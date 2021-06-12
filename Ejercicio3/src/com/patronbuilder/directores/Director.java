package com.patronbuilder.directores;

import com.patronbuilder.constructores.Builder;


public class Director {
    private Builder builder;

    public Director() {}

    public void construirAll(){
        builder.construirNuevasEdificaciones();
        builder.construirCampamento();
        builder.construirCampoEntrenamiento();
        builder.construirEscuelaInfanteria();
        builder.construirEscuelaArtilleria();
        builder.construirAcademiaPilotos();
        builder.construirEscuelaMedicina();
        builder.construirTorreVigilancia();
        builder.construirMuralla();
    }

    public void construirCampoEntrenamiento(){
        builder.construirNuevasEdificaciones();
        builder.construirCampoEntrenamiento();
        builder.construirEscuelaInfanteria();
        builder.construirEscuelaArtilleria();
        builder.construirEscuelaMedicina();
    }

    public void construirEscInfanteria(){
        builder.construirNuevasEdificaciones();
        builder.construirEscuelaInfanteria();
    }

    public void construirEscuelaArtilleria (){
        builder.construirNuevasEdificaciones();
        builder.construirEscuelaArtilleria();
        builder.construirEscuelaMedicina();
    }

    public void construirAcademiaPiloto(){
        builder.construirNuevasEdificaciones();
        builder.construirAcademiaPilotos();
        builder.construirEscuelaMedicina();
    }

    public void construirEscMedicina(){
        builder.construirNuevasEdificaciones();
        builder.construirEscuelaMedicina();
    }

    public void construirTorreVig(){
        builder.construirNuevasEdificaciones();
        builder.construirTorreVigilancia();
    }

    public void construirMuralla(){
        builder.construirNuevasEdificaciones();
        builder.construirMuralla();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
