package galeano.isabel.ui;

import galeano.isabel.gestor.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        int opcion = 0;

        do {
            opcion = mostrarMenu();
            System.out.print(Gestor.iniciarSistema(opcion));
        } while (opcion !=5 );
    }

    static int mostrarMenu() throws IOException
    {
        int opcion;
        System.out.println("");
        System.out.println("****Sistema de Aeronaves****");
        System.out.println();
        System.out.println("1. Crear un Avion");
        System.out.println("2. Crear un Helicoptero");
        System.out.println("3. Crear un Jet");
        System.out.println("4. Visualizar informacion total de Aeronaves");
        System.out.println();
        System.out.print("Ingrese la opcion que desea: ");
        return opcion = Integer.parseInt(in.readLine());

    }

}
