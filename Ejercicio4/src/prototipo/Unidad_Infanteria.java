package prototipo;

import Tipo.Infanteria;
import iPrototipo.Unidad;
import java.util.Date;

public class Unidad_Infanteria extends Unidad{

    public Unidad_Infanteria(String nombre, String color, String nave, String campamento){

        super.setNombre(nombre);
        this.setColor(color);
        this.setNave(nave);
        this.setCampamento(campamento);
        this.setFecha_enlis(new Date());
        this.setMilitante(new Infanteria());


    }




    @Override

    public Unidad clone(){
        return new Unidad_Infanteria(this.getNombre(), this.getColor(), this.getNave(), this.getCampamento());
    }
}
