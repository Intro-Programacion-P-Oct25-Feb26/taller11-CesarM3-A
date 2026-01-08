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
        viviendas();
        consumoMensual();
    }

    public static String []viviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] viviendas = new String[10];
        int contador = 1;
        for (int f = 0; f < 11; f++) {
            System.out.println("Ingrese el nombre del dueño de la vivienda"
                    + contador + ":");
            viviendas[f] = entrada.nextLine();
            contador = contador + 1;
        }
        return viviendas;
    }
    
    public static String [][]consumoMensual(){
        Scanner entrada = new Scanner(System.in);
        String [][] consumo = new String[10][12];
        int contador = 1;
        for(int f = 0; f<11; f++){
            for (int c = 0; f<13; c++){
                System.out.println("Ingrese el consumo del mes"+contador+":");
                contador = contador + 1;
            }
        }
        return consumo;
    }
    
    public static String []consumoTotal(double m){
        String [] consumoT = new String[10];
        double suma = 0; 
        for(int f = 0; f<11; f++){
            suma = 0;
            for (int c = 0; f<13; c++){
                suma = suma + m[f][c];
            }
           consumoT = suma;
        }
    }
    
    
}
