/**
 Ejercicio12: Escribir un programa que lea un año indicar si es bisiesto. 
# Nota: un año es bisiesto si es un número divisible por 4, 
# pero no si es divisible por 100, excepto que también sea divisible por 400.
#
#
#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: 


#   Variables a usar:
#   year: año a ver si es bisiesto o no

#   Pasos a Seguir:
#   pedimos los datos
#   Ejecutamos la operaciones
#   Mostramos resultado
 */
import java.util.Scanner;

public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double year;


    System.out.println("Hola, esto es un programa para averiguar si un año es bisiesto o no!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame un año: ");
    year = s.nextDouble();
    

    if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("Bisiesto");
    } else {
      System.out.println("No es bisiesto");
    }
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}