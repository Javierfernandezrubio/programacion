/**
 * Ejercicio 15:
El director de una escuela está organizando un viaje de estudios, y requiere 
determinar cuánto debe cobrar a cada alumnos y cuánto debe pagar a la compañía 
de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos 
o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es 
de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta 
del autobús es de 4000 euros, sin importar el número de alumnos. 
Realice un algoritmo que permita determinar el pago a la compañía de autobuses 
y lo que debe pagar cada alumnos por el viaje.


    Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: 


#   Variables a usar:
#   alumnos: cantidad de alumnoss que vaan al viaje


#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if; y calculamos el precio final
#   Mostramos resultados
 */
import java.util.Scanner;

public class Ejercicio15 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alumnos;


    System.out.println("Hola, esto es un programa para averiguar el coste total del bus!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el numero de alumnos qu van al viaje: ");
    alumnos = s.nextInt();


    if ( alumnos < 30 ){
      System.out.printf("El coste total es de 4000 euros y cada alumno paga\n", 4000/alumnos);
    }
    else if ( alumnos >= 30 && alumnos <= 49 ) {
      System.out.printf("El coste total es de %d euros y cada alumno paga 95 euros\n", alumnos*95);
    }
    else if ( alumnos >= 50 && alumnos <= 99 ) {
      System.out.printf("El coste total es de %d euros y cada alumno paga 70 euros\n", alumnos*70);
    }
    else if ( alumnos >= 100 ) {
      System.out.printf("El coste total es de %d euros y cada alumno paga 65 euros\n", alumnos*65);
    }
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}