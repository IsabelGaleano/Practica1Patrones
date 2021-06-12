package com.patronbuilder.main;


import com.patronbuilder.constructores.*;
import com.patronbuilder.directores.Director;
import com.patronbuilder.objetos.Edificacion;

import java.util.ArrayList;

public class Gestor {
    private static ArrayList <Edificacion> edificaciones = new ArrayList<Edificacion>();
    private Director director = new Director();


    public void construirAllEdificaciones(){
        director.setBuilder(new ConstruirCampamento());
        nuevaEdificacionOpcion1();
    }

    public void construirEdifCampoE(){
        director.setBuilder(new ConstruirCampoEntrenamiendo());
        nuevaEdificacionOpcion2();
    }

    public void construirEdifInfanteria(){
        director.setBuilder(new ConstruirEscuelaInfanteria());
        nuevaEdifOpcion3();
    }

    public void construirEdifArtilleria(){
        director.setBuilder(new ConstruirEscuelaArtilleria());
        nuevaEdifOpcion4();
    }

    public void construirEdifAcademPiloto(){
        director.setBuilder(new ConstruirAcademiaPiloto());
        nuevaEdifOpcion5();
    }

    public void construirEdifEscMedicina(){
        director.setBuilder(new ConstruirEscuelaMedicina());
        nuevaEdifOpcion6();
    }

    public void construirEdifTorreVig(){
        director.setBuilder(new ConstruirTorreVigilancia());
        nuevaEdifOpcion7();
    }

    public void construirEdifMuralla() {
        director.setBuilder(new ConstruirMuralla());
        nuevaEdifOpcion8();
    }





    private void nuevaEdificacionOpcion1(){
        director.construirAll();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdificacionOpcion2(){
        director.construirCampoEntrenamiento();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion3(){
        director.construirEscInfanteria();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion4(){
        director.construirEscuelaArtilleria();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion5() {
        director.construirAcademiaPiloto();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion6(){
        director.construirEscMedicina();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion7(){
        director.construirTorreVig();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private void nuevaEdifOpcion8(){
        director.construirMuralla();
        addEdificacion(director.getBuilder().getEdificacion());
    }

    private static void addEdificacion(Edificacion _ed){
        if (_ed != null) {
            edificaciones.add(_ed);
        }
    }

    public String obtenerDatosEdif() {
        String mResult = "";
        int num = 1;
        for (Edificacion edif : edificaciones)	{
            mResult += "\n" + "================== Edificacion " +num+ " ==================" + "\n"
            + construirResultado(edif.getEdif1())
            + construirResultado(edif.getEdif2())
            + construirResultado(edif.getEdif3())
            + construirResultado(edif.getEdif4())
            + construirResultado(edif.getEdif5())
            + construirResultado(edif.getEdif6())
            + construirResultado(edif.getEdif7())
            + construirResultado(edif.getEdif8());
            num++;
        }
        return mResult;
    }

    private String construirResultado(String _edif){
        if (!_edif.equals("")){
            return _edif + "\n";
        }
        return _edif;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}


