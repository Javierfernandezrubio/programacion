/**
 Ejercicio4: Programa que pida dos numeros, muestre su division si el 2º num no es
# cero, y si sí mostrar error.
#
#
# Autor: Javier Fernández Rubio
#
#   Fecha: 6/11/2019
#
#   Algoritmo: pediremos dos numeros, comprobamos si 2º num es cero o no.
#   Si lo es mostramos error porque un numero no se puede dividir por 0,
#   si no lo es mostramos resultado
#
#
#   Varianles a usar:
#   num1: 1º numero solicitado
#   num2: 2º numero solicitado
#
#
#   Pasos a Seguir:
#   pedir numeros
#   usando if y else comprobamos si el 2º num 0 o no
#   mostramos un resultado o un error 
 */

import java.util.Scanner;

public class Ejercicio4 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num1;
    double num2;

    System.out.println("Hola, esto es un programa para dividir dos numeros:");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el valor de los numeros: ");
    num1 = s.nextDouble();
    num2 = s.nextDouble();
    

    if (num2 != 0){
      System.out.printf("El numero %f dividido entre el numero %f es %f\n", num1, num2, num1/num2);  
    }   
    else {
      System.out.printf("ERROR, el numero %f es 0!!!\n", num2);
    }

    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}