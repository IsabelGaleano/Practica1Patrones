package prototipo;
import Tipo.Artillero;
import iPrototipo.Unidad;
import java.util.Date;

public class Unidad_Artillero extends Unidad{


    public Unidad_Artillero(String nombre, String color, String nave, String campamento){

        super.setNombre(nombre);
        this.setColor(color);
        this.setNave(nave);
        this.setCampamento(campamento);
        this.setFecha_enlis(new Date());
        this.setMilitante(new Artillero());


    }


    @Override
    public Unidad clone() {
        return new Unidad_Artillero(this.getNombre(), this.getColor(), this.getNave(), this.getCampamento());

    }
}
