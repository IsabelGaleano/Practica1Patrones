package galeano.isabel.productoConcreto;

import galeano.isabel.productoAbstracto.Aeronave;

import java.util.ArrayList;

public class Jet implements Aeronave {

    private int codigo;
    private int velocidad;
    private int cargaPersonas;
    private ArrayList<String> armamento;
    private ArrayList<String> provisiones;

    public Jet() {
    }

    public Jet(int velocidad, int cargaPersonas, ArrayList<String> armamento, ArrayList<String> provisiones) {
        this.velocidad = velocidad;
        this.cargaPersonas = cargaPersonas;
        this.armamento = armamento;
        this.provisiones = provisiones;
    }

    //Funciones implementadas por la interface
    @Override
    public String obtenerCodigo() {
        return null;
    }

    @Override
    public int generarCodigo() {
        return (int) (Math.random() * 9999);
    }

    @Override
    public String obtenerInfo() {
        return "*******Jet******" +
                "codigo=" + codigo + "\n" +
                "velocidad=" + velocidad + "\n" +
                "cargaPersonas=" + cargaPersonas + "\n" +
                "armamento=" + armamento + "\n" +
                "provisiones=" + provisiones;
    }

    //sets and gets

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = 300000 + codigo;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCargaPersonas() {
        return cargaPersonas;
    }

    public void setCargaPersonas(int cargaPersonas) {
        this.cargaPersonas = cargaPersonas;
    }

    public ArrayList<String> getArmamento() {
        return armamento;
    }

    public void setArmamento(ArrayList<String> armamento) {
        this.armamento = armamento;
    }

    public ArrayList<String> getProvisiones() {
        return provisiones;
    }

    public void setProvisiones(ArrayList<String> provisiones) {
        this.provisiones = provisiones;
    }
}
