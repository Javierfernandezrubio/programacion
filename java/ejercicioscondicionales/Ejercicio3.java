/**
 Ejercicio3: Programa que haga un algoritmo que pida un número e indique 
# si es par o impar
#
#
#   Autor: Javier Fernández Rubio
#
#   Fecha: 6/11/2019
#
#   Algoritmo: pediremos un numero usando la clase Scaner que importaremos
    previamente, lo dividiremos por dos, y viendo su 
#   resto es 0 o no es o, sabremos si es par o impar.
#
#
#   Varianles a usar:
#   num: numero solicitado
#   
#
#
#   Pasos a Seguir:
#   pedir numero
#   dividimos por dos y sacamos el resto
#   comprobamos si el resto es 0 o no
#   mostramos si es par o impar
 */

import java.util.Scanner;

public class Ejercicio3 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num;

    System.out.println("Hola, esto es un programa para ver si un numero es par o impar:");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el valor del numero: ");
    num = s.nextDouble();
    

    if (num % 2 == 0){
      System.out.printf("El numero %f es par\n", num);  
    }   
    else {
      System.out.printf("Los numeros %f es impar\n", num);
    }
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}