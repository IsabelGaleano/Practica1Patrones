package Tipo;

public class Artillero extends Militante{
    private int id;

    public Artillero(){
        this.id= 1;
        super.setDescripcion("Artillero");
        this.setAtaque(5);
        this.setDefensa(5);
        this.setEstamina(3);
        this.setCuracion(1);



    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
