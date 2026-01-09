/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] arregloCiudades = obtenerCiudades();
        imprimirCiudades(arregloCiudades);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;

        System.out.print("Ingrese el número de ciudades: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        String[] ciudades = new String[n];

        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Ingrese la ciudad " + contador + ": ");
            ciudades[i] = entrada.nextLine();
            contador = contador + 1;
        }
        return ciudades;
    }

    public static void imprimirCiudades(String[] ciudades) {
        System.out.printf("\nCiudades con 4 o 5 caracteres:\n");
        for (int i = 0; i < ciudades.length; i++) {
            int longitud = ciudades[i].length();
            if (longitud == 4 || longitud == 5) {
                System.out.printf("%s\n", ciudades[i]);
            }
        }
    }

}
