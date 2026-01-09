/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {
    public static void main(String[] args) {
        // 

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] arreglo3 = llenarMatriz(informacion, informacion2);

        obtenerReporte(informacion);

        obtenerReporte(informacion2);

        obtenerReporte(arreglo3);
    }

    public static int [][] llenarMatriz(int[][] a, int[][] b) {
        int[][] z = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                z[i][j] = obtenerMultiplicacion(a[i][j],
                        b[i][j]);
            }
        }
        return z;
    }

    public static void obtenerReporte(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a + b;
        return operacion;

    }
}
