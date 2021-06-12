package Principal;

import java.util.ArrayList;
import java.util.Random;

import iPrototipo.Unidad;


import prototipo.Unidad_Doctor;
import prototipo.Unidad_Artillero;
import prototipo.Unidad_Piloto;
import prototipo.Unidad_Infanteria;



public class Gestor {
    private static ArrayList <Unidad> arrUnidades = new ArrayList<Unidad>();
    private int id_Artillero;
    private int id_Doctor;
    private int id_Piloto;
    private int id_Infanteria;


    private Unidad prototipoAr;
    private Unidad prototipoIn;
    private Unidad prototipoPi;
    private Unidad prototipoDo;


    Gestor(int pId1, int pId2,int pId3, int pId4 ){
        id_Artillero = pId1;
        id_Doctor = pId2;
        id_Infanteria = pId1;
        id_Piloto = pId2;


       prototipoAr = new Unidad_Artillero("Artillero Default", "Color Deafault","Nave Default", "Campamento Default");
        prototipoIn = new Unidad_Infanteria("Infantería Default", "Color Deafault","Nave Default", "Campamento Default");
        prototipoPi = new Unidad_Piloto("Piloto Default", "Color Deafault","Nave Default", "Campamento Default");
        prototipoDo = new Unidad_Doctor("Doctor Default", "Color Deafault","Nave Default", "Campamento Default");
    }



    public void nueva_Unidad(int pNum) {

       int serie=0;
        switch (pNum){
            case 1:
                arrUnidades.add(prototipoAr.clone());
                id_Artillero++;
                serie=id_Artillero;
                break;
            case 2:
                arrUnidades.add(prototipoIn.clone());
                id_Infanteria++;
                serie=id_Infanteria;
                break;
            case 3:
                arrUnidades.add(prototipoPi.clone());
                id_Piloto++;
                serie=id_Piloto;
                break;
            case 4:
                arrUnidades.add(prototipoDo.clone());
                id_Doctor++;
                serie=id_Doctor;
                break;
            default:
                arrUnidades.add(prototipoAr.clone());
                id_Artillero++;
                serie=id_Artillero;
              
                break;

        }
        updateCloneCamisa(pNum, serie);
        
    }



    private static void updateCloneCamisa(int pId, int pSerie) {
       Unidad cc = arrUnidades.get(pId);
        Random r = new Random();

        //Cambiamos de atributos
        cc.setNombre(Helper.cambiarNombre(Helper.ramdomize()));
        cc.setColor(Helper.cambiarColor((Helper.ramdomize())));
        cc.setNombre(Helper.cambiarNave(Helper.ramdomize()));
        cc.setCampamento(Helper.cambiarCampamento(Helper.ramdomize()));
        cc.setJugador(Helper.cambiarJugador(Helper.ramdomize()));

        cc.setId(cc.getMilitante()+" "+ cc.getColor()+" "+cc.getJugador());




    }

    /************************************************************
     * Metodo:		add_objeto_array
     *
     * Descripción:	Recibe un nuevo objeto y lo guarda en el array.
     *
     * Parametros:	pObj [Artillero]
     *
     * @return:		Void
     *************************************************************/

    private static void add_objeto_array(Unidad pObj) {
        arrUnidades.add(pObj);
    }
    public String obtenerDatos() {
        String mResult = "";
        for (Unidad mOb : arrUnidades)	{
            mResult += obtenerDatosObjeto(mOb) + "\n";
        }

        return mResult;
    }

    /************************************************************
     * Metodo:		obtenerDatosObjeto
     *
     * Descripción:	Obtiene los datos de un objeto en especifico
     *
     * Parametros:	pObj [Unidad]
     *
     * @return:		mResult [String]
     *************************************************************/

    private String obtenerDatosObjeto(Unidad pObj) {
        return pObj.getData() + "\n" ;
    }


    /************************************************************
     * Metodo:		obtenerDatos
     *
     * Descripción:	Obtiene los datos de los objetos del arreglo y los
     * 				devuelve en una variable.
     *
     * Parametros:	pid [int] id del arreglo.
     *
     * @return:		mResult [String]
     *************************************************************/


    public String obtenerDatos(int pid) {
        return obtenerDatosObjeto(arrUnidades.get(pid)) + "\n";
    }
}
