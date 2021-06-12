package Tipo;

public class Infanteria extends Militante{


    private int id;

    public Infanteria(){
        this.id= 1;
        super.setDescripcion("Infanteria");
        this.setAtaque(5);
        this.setDefensa(5);
        this.setEstamina(5);
        this.setCuracion(0);




    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
