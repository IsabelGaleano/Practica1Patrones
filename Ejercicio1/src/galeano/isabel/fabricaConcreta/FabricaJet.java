package galeano.isabel.fabricaConcreta;

import galeano.isabel.fabricaAbstracta.FabricaAeronave;
import galeano.isabel.productoAbstracto.Aeronave;
import galeano.isabel.productoConcreto.Avion;
import galeano.isabel.productoConcreto.Jet;

import java.util.ArrayList;

public class FabricaJet implements FabricaAeronave {

    @Override
    public Aeronave crearAeronave() {
        ArrayList<String> armamento = new ArrayList<>();
        ArrayList<String> provisiones = new ArrayList<>();
        armamento.add("Misiles");
        provisiones.add("4 bombas");

        Jet jet = new Jet(1092,4,armamento, provisiones);
        jet.setCodigo(jet.generarCodigo());
        return jet;
    }
}
