package Tipo;

public class Doctor extends Militante {


    private int id;

    public Doctor(){
        this.id= 1;
        super.setDescripcion("Doctor");
        this.setAtaque(2);
        this.setDefensa(5);
        this.setEstamina(3);
        this.setCuracion(5);



    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
