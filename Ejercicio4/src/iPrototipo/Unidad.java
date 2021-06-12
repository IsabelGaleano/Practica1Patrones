package iPrototipo;
import java.util.Date;

import Tipo.Militante;

public abstract class Unidad {
    String id;



    private String nombre;
    private String nave;
    private String campamento;


    private String jugador;
    private String color;
    private Date fecha_enlis;
    private  Militante militante;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public String getCampamento() {
        return campamento;
    }

    public void setCampamento(String campamento) {
        this.campamento = campamento;
    }

    public abstract Unidad clone();



    public void setNombre(String nombre) {
        this.jugador = nombre;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha_enlis() {
        return fecha_enlis;
    }

    public void setFecha_enlis(Date fecha_enlis) {
        this.fecha_enlis = fecha_enlis;
    }


    public void setMilitante(Militante militante) {
        this.militante = militante;
    }

    public String getMilitante() {
        return militante.getDescripcion();
    }







    public String getData() {
        String mData= "< Sobre esta unidad >\n";
        mData += "Jugador : " + this.getJugador() + "\n";
        mData += "Tipo : " + this.getMilitante() + "\n";
        mData += "Nombre: " + this.getNombre() + "\n";
        mData += "Nave: " + this.getNave() + "\n";
        mData += "Fecha de Enlistamiento: " + this.getFecha_enlis() + "\n";




        return mData;
    }
}
