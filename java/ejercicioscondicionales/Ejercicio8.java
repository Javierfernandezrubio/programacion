import java.util.Scanner;

/**
 Ejercicio8: Programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
# mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
# dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
# imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
#
#
#
# Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: pedimos nota(double) y edad(int), y el sexo(caracter).
#   Comprobamos si nota es mayor que 5, edad que 18 y que sexo es F, por lo cual
#   mostramos ACEPTADA. Hacemos lo miso pero cambiando sexo a M, y mostramos POSIBLE
#   Si nada de esto se cumple mostramos NO ACEPTADX
#
#   Variables a usar:
#   nota: nota de examen
#   edad: edad de la persona
#   sexo: f(femenino) o m(masculino)
#
#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if y else
#   Mostramos resultado
 */

import java.util.Scanner;

public class Ejercicio8 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int edad;
    double nota;
    Character sexo;
    Character f = 'f';
    Character m = 'm';


    System.out.println("Hola, esto es un programa para averiguar si estás aceptada o no!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame tu sexo(f/m) y edad: ");
    sexo = s.nextLine().charAt(0);
    edad = s.nextInt();
    System.out.println("Ahora dame tu nota:");
    nota = s.nextDouble();
    

    if ( (sexo.equals(f)) && (edad >= 18) && (nota >= 5)){
      System.out.println("ACEPTADA");
    }
    else if ( (sexo.equals(m)) && (edad >= 18) && (nota >= 5) ) {
      System.out.println("POSIBLE");
    } else {
      System.out.println("NO ACEPTADX");
    }
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}