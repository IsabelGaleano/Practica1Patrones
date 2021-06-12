package com.patronbuilder.objetos;

public class Edificacion {
    protected String edif1, edif2, edif3, edif4, edif5, edif6, edif7, edif8;

    public Edificacion(String edif1, String edif2, String edif3, String edif4, String edif5, String edif6,
                       String edif7, String edif8) {
        this.edif1 = edif1;
        this.edif2 = edif2;
        this.edif3 = edif3;
        this.edif4 = edif4;
        this.edif5 = edif5;
        this.edif6 = edif6;
        this.edif7 = edif7;
        this.edif8 = edif8;
    }

    public Edificacion (){
        this.edif1 = "";
        this.edif2 = "";
        this.edif3 = "";
        this.edif4 = "";
        this.edif5 = "";
        this.edif6 = "";
        this.edif7 = "";
        this.edif8 = "";
    }

    public String getEdif1() {
        return edif1;
    }

    public void setEdif1(String edif1) {
        this.edif1 = edif1;
    }

    public String getEdif2() {
        return edif2;
    }

    public void setEdif2(String edif2) {
        this.edif2 = edif2;
    }

    public String getEdif3() {
        return edif3;
    }

    public void setEdif3(String edif3) {
        this.edif3 = edif3;
    }

    public String getEdif4() {
        return edif4;
    }

    public void setEdif4(String edif4) {
        this.edif4 = edif4;
    }

    public String getEdif5() {
        return edif5;
    }

    public void setEdif5(String edif5) {
        this.edif5 = edif5;
    }

    public String getEdif6() {
        return edif6;
    }

    public void setEdif6(String edif6) {
        this.edif6 = edif6;
    }

    public String getEdif7() {
        return edif7;
    }

    public void setEdif7(String edif7) {
        this.edif7 = edif7;
    }

    public String getEdif8() {
        return edif8;
    }

    public void setEdif8(String edif8) {
        this.edif8 = edif8;
    }
}
