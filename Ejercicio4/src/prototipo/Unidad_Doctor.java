package prototipo;

import Tipo.Doctor;
import java.util.Date;
import iPrototipo.Unidad;
public class Unidad_Doctor extends Unidad{

    public Unidad_Doctor(String nombre, String color, String nave, String campamento){

        super.setNombre(nombre);
        this.setColor(color);
        this.setNave(nave);
        this.setCampamento(campamento);
        this.setFecha_enlis(new Date());
        this.setMilitante(new Doctor());


    }




    @Override

    public Unidad clone(){
        return new Unidad_Doctor(this.getNombre(), this.getColor(), this.getNave(), this.getCampamento());
    }
}
