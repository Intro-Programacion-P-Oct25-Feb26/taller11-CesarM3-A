/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo1 = viviendas();
        double[][] arreglo2 = consumoMensual();
        double[] arreglo3 = consumoTotal(arreglo2);
        String mensaje = "";

        for (int f = 0; f < arreglo1.length;f++) {
            System.out.printf("El consumo de %s es de $%.2f\n",
            arreglo1[f], arreglo3[f]);
        }
    }

    public static String[] viviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        int contador = 1;
        for (int f = 0; f < viviendas.length; f++) {
            System.out.println("Ingrese el nombre del dueño de la vivienda "
                    + contador + ":");
            viviendas[f] = entrada.nextLine();
            contador = contador + 1;
        }
        return viviendas;
    }

    public static double[][] consumoMensual() {
        Scanner entrada = new Scanner(System.in);
        double[][] consumo = new double[10][12];
        int contador = 1;
        for (int f = 0; f < consumo.length; f++) {
            contador = 1;
            for (int c = 0; c < consumo[f].length; c++) {
                System.out.println("Ingrese el consumo del mes "+contador+":");
                consumo[f][c] = entrada.nextDouble();
                contador = contador + 1;
            }
        }
        return consumo;
    }

    public static double[] consumoTotal(double m[][]) {
        double[] consumoT = new double[10];
        double suma = 0;
        for (int f = 0; f < consumoT.length; f++) {
            suma = 0;
            for (int c = 0; c < m[f].length; c++) {
                suma = suma + m[f][c];
            }
            consumoT[f] = suma;
        }
        return consumoT;
    }
}
