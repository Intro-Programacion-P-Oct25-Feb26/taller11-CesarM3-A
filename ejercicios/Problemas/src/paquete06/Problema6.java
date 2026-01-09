/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        int [] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double promedio = obtenerMedia(informacion);
        double desviacion = desviacionEstandar(informacion, promedio);
        
        System.out.printf("Media aritmética: %s\n"
                + "Desviación estándar: %s", promedio, desviacion);
    }
    public static double obtenerMedia(int [] a){
        double suma = 0;
        double media;
        for (int f = 0; f<a.length; f++){
            suma = suma + a[f];
        }
        media = suma / 9;
        return media;
    }
    public static double desviacionEstandar(int[]informacion, double promedio) {
        double suma = 0;
        double valor;
        double total;
        for (int i = 0; i < informacion.length; i++) {
            valor = informacion[i] - promedio;
            suma = suma + Math.pow(valor, 2);
        }
        total = Math.sqrt(suma / 9);
        return total;
    }
    
}
