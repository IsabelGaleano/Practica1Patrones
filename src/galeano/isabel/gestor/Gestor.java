package galeano.isabel.gestor;

import galeano.isabel.fabricaAbstracta.FabricaAeronave;
import galeano.isabel.fabricaConcreta.FabricaAvion;
import galeano.isabel.fabricaConcreta.FabricaHelicoptero;
import galeano.isabel.fabricaConcreta.FabricaJet;
import galeano.isabel.productoAbstracto.Aeronave;

import java.util.ArrayList;

public class Gestor {
    private static ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();

    public static String crearFabricaAeronaves(FabricaAeronave fabrica) {
        Aeronave aeronave = fabrica.crearAeronave();
        agregarAeronave(aeronave);
        return aeronave.obtenerInfo();
    }

    private static void agregarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    private static String obtenerInformacion() {
        String info = "";

        for (int i = 0; i <aeronaves.size() ; i++) {
            info = info + aeronaves.get(i).obtenerInfo() + "\n";
        }

        return  info;
    }

    public static String iniciarSistema(int opcion) {
        String informacion ="";
        FabricaAeronave fabricaAeronave;

        switch (opcion) {

            case 1:
                fabricaAeronave  = new FabricaAvion();
                informacion = crearFabricaAeronaves(fabricaAeronave);
                break;

            case 2:
                fabricaAeronave  = new FabricaHelicoptero();
                informacion = crearFabricaAeronaves(fabricaAeronave);
                break;

            case 3:
                fabricaAeronave  = new FabricaJet();
                informacion = crearFabricaAeronaves(fabricaAeronave);
                break;

            case 4:
                informacion = obtenerInformacion();
                break;
            case 5:
                informacion = "Fin del sistema";
                break;

            default:
                informacion = "Opcion invalida";
                break;
        }

        return informacion;

    }
}
