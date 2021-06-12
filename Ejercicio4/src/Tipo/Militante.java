package Tipo;

public abstract class Militante {

    private String descripcion;
    private int ataque;
    private int defensa;
    private int estamina;
    private int curacion;




    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int def) {
        this.defensa = def;
    }

    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getCuracion() {
        return ataque;
    }
    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }



}
