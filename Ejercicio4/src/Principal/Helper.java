package Principal;

public class Helper {

    static int ramdomize() {
        return (int) (Math.random() * 4) + 1;
    }






    /************************************************************
     * Metodo:		cambioColor
     *
     * Descripción:	Permite obtener un color random
     *
     * Parametros:	pId   [int]
     *
     * @return:		Color [String] // Color aleatorio
     * Autor: Erick Brenes
     *************************************************************/
    public static String cambiarColor(int pId) {
        String mColor;
        switch (pId){
            case 1:
                mColor = "Rosado";
                break;
            case 2:
                mColor="Azul";
                break;
            case 3:
                mColor="Verde";
                break;
            case 4:
                mColor="Rojo";
                break;
            default:
                mColor="Negro";
                break;

        }
        return mColor;
    }
    /************************************************************
     * Metodo:		cambiarNave
     *
     * Descripción:	Permite obtener una nave random
     *
     * Parametros:	pId   [int]
     *
     * @return:		una nave [string]
     * Autor: Erick Brenes
     *************************************************************/

    public static String cambiarNave(int pId) {
        String mEst="";
        switch (pId){
            case 1:
                mEst="AT-99 Scorpion";
                break;
            case 2:
                mEst="D79-TC Pelican";
                break;
            case 3:
                mEst="Condor";
                break;
            case 4:
                mEst="YSS-1000 Sabre";
                break;
            default:
                mEst="Vertigo";
                break;

        }
        return mEst;
    }

    /************************************************************
     * Metodo:		cambiarNombre
     *
     * Descripción:	Permite obtener un nombre
     *
     * Parametros:	pId   [int]
     *
     * @return:		un nombre[string]

     *************************************************************/


    public static String cambiarNombre(int pId) {
        String mColor;
        switch (pId){
            case 1:
                mColor = "Jayce";
                break;
            case 2:
                mColor="Darius";
                break;
            case 3:
                mColor="Viego";
                break;
            case 4:
                mColor="Katarina";
                break;
            default:
                mColor="Tristana";
                break;

        }
        return mColor;
    }

    public static String cambiarCampamento(int pId) {
        String mEst="";
        switch (pId){
            case 1:
                mEst="Campamento Alpha";
                break;
            case 2:
                mEst="Campamento Beta";
                break;
            case 3:
                mEst="Campamento Charlie";
                break;
            case 4:
                mEst="Campamento Delta";
                break;
            default:
                mEst="Campamento X";
                break;

        }
        return mEst;
    }
    public static String cambiarJugador(int pId) {
        String mEst="";
        switch (pId){
            case 1:
                mEst="Jugador 1";
                break;
            case 2:
                mEst="Jugador 2";
                break;
            case 3:
                mEst="Jugador 3";
                break;
            case 4:
                mEst="Jugador 4";
                break;
            default:
                mEst="Jugador X";
                break;

        }
        return mEst;
    }


}
