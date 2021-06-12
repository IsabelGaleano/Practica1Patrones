package com.patronbuilder.constructores;

import com.patronbuilder.objetos.Edificacion;


public abstract class Builder {
    protected Edificacion edificacion;

    public Edificacion getEdificacion() {
        return this.edificacion;
    }

    public void construirNuevasEdificaciones(){
        this.edificacion = new Edificacion();
    }

    public abstract void construirCampamento();
    public abstract void construirCampoEntrenamiento();
    public abstract void construirEscuelaInfanteria();
    public abstract void construirEscuelaArtilleria();
    public abstract void construirAcademiaPilotos();
    public abstract void construirEscuelaMedicina();
    public abstract void construirTorreVigilancia();
    public abstract void construirMuralla();
}

