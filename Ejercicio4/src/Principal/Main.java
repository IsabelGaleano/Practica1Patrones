package Principal;

public class Main {

    private static Gestor gGestor;

    public static void main(String[] args) {
        // Variables
        int mSerie=0;
        int idAr = 100;
        int idIn = 200;
        int idPi = 300;
        int idDo = 400;
        int j=0;
        //Inicializamos el gestor.
        gGestor = new Gestor(idAr,idIn,idPi, idDo);

        //Creamos los clones
        for(int i = 0; i<10;i++){


            gGestor.nueva_Unidad(j);}


        //Los imprimimos
        System.out.println(gGestor.obtenerDatos());

    }


}
