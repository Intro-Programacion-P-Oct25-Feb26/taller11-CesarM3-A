/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombre = "";
        String cedula = "";

        System.out.println("Que valor desea cancelar:\n1. Planilla de luz\n"
                + "2. Predio de un bien inmueble.");
        opcion = entrada.nextInt();
        entrada.nextLine();
        
        if ((opcion == 0) || (opcion > 3)) {
            System.out.println("Número ingresado no valido.");
        } else {
            if ((opcion > 0)||(opcion<=2)) {
                System.out.println("Ingrese su nombre:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su cedula:");
                cedula = entrada.nextLine();
            }
            if (opcion == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    calcularPredio(nombre, cedula);
                }
            }

        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double kC;
        double k;
        double m;
        System.out.println("Ingrese el valor de kilovatio:");
        kC = entrada.nextDouble();
        System.out.println("Ingrese su numero de kilovatios consumidos:");
        k = entrada.nextDouble();

        m = kC * k;

        System.out.printf("Cliente %s con cédula %s debe cancelar un "
                + "valor de $%.2f", nombre, cedula, m);
    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double pC;
        double iva = 0.2;
        double m;
        System.out.println("Ingrese el valor de su inmueble:");
        pC = entrada.nextDouble();

        m = pC * iva;

        System.out.printf("Cliente %s con cédula %s debe cancelar un "
                + "valor de $%.2f", nombre, cedula, m);
    }
}
