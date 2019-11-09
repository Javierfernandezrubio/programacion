/**
 * Ejercicio 17
Realiza un programa que pida por teclado el resultado (dato entero) 
obtenido al lanzar un dado de seis caras y muestre por pantalla el 
número en letras (dato cadena) de la cara opuesta al resultado obtenido.

Nota 1: En las caras opuestas de un dado de seis caras están los números:
 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
se mostrará el mensaje: “ERROR: número incorrecto.”.


#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019

#   Algoritmo: 


#   Variables a usar:
#   num: numero del dado aleatorio al que mostrar su opuesto

#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if y else 
#   Mostramos resultado
 */
import java.util.Scanner;

public class Ejercicio17 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;


    System.out.println("Hola, esto es un programa para averiguar el lado opuesto al lado del dado!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el numero aleatorio del dado para calcular su opuesto: ");
    num = s.nextInt();


    if (num == 1){
      System.out.println("El lado opuesto es el seis");
    } 
    else if (num == 2) {
      System.out.println("El lado opuesto es el cinco");
    }
    else if (num == 3) {
      System.out.println("El lado opuesto es el cuatro");
    }
    else if (num == 4) {
      System.out.println("El lado opuesto es el tres");
    }
    else if (num == 5) {
      System.out.println("El lado opuesto es el dos");
    }
    else if (num == 6) {
      System.out.println("El lado opuesto es el uno");
    } else {
      System.out.println("El numero introducido es erroneo");
    }
      
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}