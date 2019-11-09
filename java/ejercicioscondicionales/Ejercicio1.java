/**
 Ejercicio1: Programa que haga un algoritmo que pida dos números e indique 
# si el primero es mayor que el segundo o no.
#
#
# Autor: Javier Fernández Rubio
#
#   Fecha: 6/11/2019
#
#   Algoritmo: pediremos dos numeros usando la clase Scaner que importaremos
    previamente; usar la estructura de If y Else if
#   para solucionar cual es mayor o menor respecto al otro 
#
#
#   Varianles a usar:
#   num1: primer numero solicitado
#   num2: segundo numero solicitado
#
#
#   Pasos a Seguir:
#   pedir numeros
#   ejecutar las alternativas if, else, else if
    mostrar resultado

*/
import java.util.Scanner;

public class Ejercicio1 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double num1;
    double num2;
    System.out.println("Hola, esto es un programa para ver si un numero es mayor que otro:");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el valor de cada uno de los dos numeros: ");
    num1 = s.nextDouble();
    num2 = s.nextDouble();

    if (num1 > num2){
      System.out.printf("El numero %f es mayor que el numero %f\n", num1, num2);  
    }  
    else if (num2 > num1) {
      System.out.printf("El numero %f es mayor que el numero %f\n", num2, num1);
    } 
    else {
      System.out.printf("Los numeros %f y %f son iguales.\n", num1, num2);
    }
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}