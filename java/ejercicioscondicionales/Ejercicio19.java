/**
 * Ejercicio 19
Escribe un programa que pida un número entero entre uno y doce e imprima 
el número de días que tiene el mes correspondiente.

#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019

#   Algoritmo: 

#   Variables a usar:
#   num: numero pedido que corresponde al mes 


#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if y else
#   Mostramos resultados dependiendo del dato introducido
 */
import java.util.Scanner;

public class Ejercicio19 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;


    System.out.println("Hola, esto es un programa para averiguar los dias del mes introducido!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el numero del mes que quieres saber sus dias(1 al 12): ");
    num = s.nextInt();


    if (num == 4 || num == 6 || num == 9 || num == 11){
      System.out.println("El mes tiene 30 dias");
    } 
    else if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
      System.out.println("El mes tiene 31 dias");
    }
    else if (num == 2) {
      System.out.println("Es febrero, por lo tanto tiene 28 dias(29 si es bisiesto)");
    } else {
      System.out.println("Numero erroneo introducido");
    }
      
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}