package galeano.isabel.fabricaConcreta;

import galeano.isabel.fabricaAbstracta.FabricaAeronave;
import galeano.isabel.productoAbstracto.Aeronave;
import galeano.isabel.productoConcreto.Avion;
import galeano.isabel.productoConcreto.Helicoptero;

import java.util.ArrayList;

public class FabricaHelicoptero implements FabricaAeronave {
    @Override
    public Aeronave crearAeronave() {
        ArrayList<String> armamento = new ArrayList<>();
        ArrayList<String> provisiones = new ArrayList<>();
        armamento.add("Metralleta");
        armamento.add("Misiles");
        armamento.add("Bomba");
        provisiones.add("Balas 6kg");
        provisiones.add("10 misiles");
        provisiones.add("4 bombas");

        Helicoptero helicoptero = new Helicoptero(400, 40, armamento, provisiones);
        helicoptero.setCodigo(helicoptero.generarCodigo());

        return helicoptero;
    }
}
