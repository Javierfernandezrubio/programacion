/**
 * Ejercicio 18
Realiza un programa que pida el día de la semana (del 1 al 7) y escriba 
el día correspondiente. Si introducimos otro número nos da un error.

#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019

#   Algoritmo: 


#   Variables a usar:
#   num: numero pedido que corresponde a un dia de la semana
#


#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if y else
#   Mostramos resultados dependiendo del dato introducido
 */
import java.util.Scanner;

public class Ejercicio18 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;


    System.out.println("Hola, esto es un programa para averiguar el dia de la semana!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el numero de la semana(1 al 7): ");
    num = s.nextInt();


    if (num == 1){
      System.out.println("El dia de la semana es lunes");
    } 
    else if (num == 2) {
      System.out.println("El dia de la semana es martes");
    }
    else if (num == 3) {
      System.out.println("El dia de la semana es miercoles");
    }
    else if (num == 4) {
      System.out.println("El dia de la semana es jueves");
    }
    else if (num == 5) {
      System.out.println("El dia de la semana es viernes");
    }
    else if (num == 6) {
      System.out.println("El dia de la semana es sabado");
    }
    else if (num == 7) {
      System.out.println("El dia de la semana es domingo");
    } else {
      System.out.println("El numero introducido es erroneo");
    }
      
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}