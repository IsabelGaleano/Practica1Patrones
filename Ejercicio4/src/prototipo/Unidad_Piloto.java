package prototipo;


import Tipo.Piloto;
import iPrototipo.Unidad;
import java.util.Date;

public class Unidad_Piloto extends Unidad{

    public Unidad_Piloto(String nombre, String color, String nave, String campamento){

        super.setNombre(nombre);
        this.setColor(color);
        this.setNave(nave);
        this.setCampamento(campamento);
        this.setFecha_enlis(new Date());
        this.setMilitante(new Piloto());


    }




    @Override

    public Unidad clone(){
        return new Unidad_Piloto(this.getNombre(), this.getColor(), this.getNave(), this.getCampamento());
    }

}
