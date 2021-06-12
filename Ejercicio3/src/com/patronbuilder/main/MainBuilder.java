package com.patronbuilder.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MainBuilder {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    private static Gestor gestor = new Gestor();

    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        int opcion;
        boolean salir = false;

        do {
            out.println("============================================================");
            out.println("1. Construir Campamento.");
            out.println("2. Construir Campo de Entrenamiento.");
            out.println("3. Construir Escuela de Infantería.");
            out.println("4. Construir Escuela de Artillería.");
            out.println("5. Construir Academia de Pilotos.");
            out.println("6. Construir Escuela de Medicina.");
            out.println("7. Construir Torre de Vigilancia.");
            out.println("8. Cosntruir Muralla.");
            out.println("9. Lista de Edificaciones.");
            out.println("10. Finalizar la construcción de Edificaciones.");
            out.println("-------------------------------------------------------------");
            out.println("Ingrese el número de la edificación que desea construir.");
            out.println("============================================================");
            opcion = Integer.parseInt(in.readLine());
            salir = opcionMenu(opcion);
        }while (!salir);
    }

    public static boolean opcionMenu (int _opcion){
        boolean salir = false;
        switch (_opcion){
            case 1:
                gestor.construirAllEdificaciones();
                break;

            case 2:
                gestor.construirEdifCampoE();
                break;

            case 3:
                gestor.construirEdifInfanteria();
                break;

            case 4:
                gestor.construirEdifArtilleria();
                break;

            case 5:
                gestor.construirEdifAcademPiloto();
                break;

            case 6:
                gestor.construirEdifEscMedicina();
                break;

            case 7:
                gestor.construirEdifTorreVig();
                break;

            case 8:
                gestor.construirEdifMuralla();
                break;

            case 9:
                    out.println(gestor.obtenerDatosEdif());
                break;

            case 10:
                salir = true;
                break;

            default:
                out.println("Opción mal digitada, vuelva a digiar la opción.");
                salir = false;
                break;
        }
        return salir;
    }
}