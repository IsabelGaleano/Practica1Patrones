package Tipo;


public class Piloto extends Militante {

    private int id;

    public Piloto(){
        this.id= 1;
        super.setDescripcion("Piloto");
        this.setAtaque(1);
        this.setDefensa(3);
        this.setEstamina(5);
        this.setCuracion(1);



    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
