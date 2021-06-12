package galeano.isabel.fabricaConcreta;

import galeano.isabel.fabricaAbstracta.FabricaAeronave;
import galeano.isabel.productoAbstracto.Aeronave;
import galeano.isabel.productoConcreto.Avion;

import java.util.ArrayList;

public class FabricaAvion implements FabricaAeronave {

    @Override
    public Aeronave crearAeronave() {
        ArrayList<String> armamento = new ArrayList<>();
        ArrayList<String> provisiones = new ArrayList<>();
        armamento.add("Bombas");
        armamento.add("Metralletas");
        provisiones.add("10 bombas");
        provisiones.add("Balas 1kg");

        Avion avion = new Avion(592, 102, armamento, provisiones);
        avion.setCodigo(avion.generarCodigo());

        return avion;
    }
}
