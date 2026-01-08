/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String resultado = "";
        int opcion;

        System.out.println("Ingrese el área a calcular: 1. cuadrado, "
                + "2. triángulo, 3. rectángulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    resultado = "Valor inválido";
                }
            }
        }
        System.out.println(resultado);
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double area;
        String mensaje;
        System.out.println("Ingrese la longitud del lado del cuadrado:");
        lado = entrada.nextDouble();
        area = lado * lado;
        mensaje = String.format("El área del cuadrado de lado: %.2f es: %.2f",
                lado, area);
        System.out.printf(mensaje);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        String mensaje;
        System.out.println("Ingrese la base del triangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;
        mensaje = String.format("El área del triángulo de base: %.2f y "
                + "altura: %.2f"
                + " es: %.2f",
                base, altura, area);
        System.out.printf(mensaje);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        String mensaje;
        System.out.println("Ingrese la base del rectangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        altura = entrada.nextDouble();

        area = (base * altura);
        mensaje = String.format("El área del rectángulo de base: %.2f y "
                + "altura: %.2f"
                + " es: %.2f",
                base, altura, area);
        System.out.printf(mensaje);
    }
}
