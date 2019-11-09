/**
 Ejercicio10: Programa que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
#   circunferencias y las clasifique en uno de estos estados:
#   -exteriores
#   -tangentes exteriores
#   -secantes
#   -tangentes interiores
#   -interiores
#   -concéntricas
#
#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: 
#
#   Variables a usar:
#   x1: x de centro circunferencia 1
#   y1: y de centro circunferencia 1
#   x2: x de centro circunferencia 2
#   y2: y de centro circunferencia 2
#   distancia: distancia entre los centros Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)
#   radio1: radio circunferencia 1
#   radio2: radio circunferencia 2



#   Pasos a Seguir:
#   pedimos los datos
#   Sacamos la variable d
#   Comprobamos con if, else if y else
#   Mostramos resultado
#
 */

import java.util.Scanner;

public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double x1;
    double y1;
    double x2;
    double y2;
    double radio1;
    double radio2;
    double distancia;

    System.out.println("Hola, esto es un programa para averiguar como están dos circunferencias!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame la X e Y de la 1ª circunferencia y su radio:");
    x1 = s.nextDouble();
    y1 = s.nextDouble();
    radio1 = s.nextDouble();

    System.out.println("Ahora dame la X e Y de la 2ª circunferencia y su radio:");
    x2 = s.nextDouble();
    y2 = s.nextDouble();
    radio2 = s.nextDouble();

    distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
    System.out.printf("La distancia entre los centros de las circunferencias es: %.3f \n", distancia);
    

    if (distancia > radio1+radio2) {
      System.out.println("Las circunferencias son exteriores");
    }
    else if (distancia == radio1+radio2) {
      System.out.println("Las circunferencias son tangentes exteriores");
    }
    else if (distancia == 0 && radio1 == radio2) {
      System.out.println("Las circunferencias son iguales");
    }
    else if (distancia == 0) {
      System.out.println("Las circunferencias son concentricas");
    }
    else if (distancia < radio1+radio2 && distancia > Math.abs(radio1-radio2) ) {
      System.out.println("Las circunferencias son secantes");
    }
    else if (distancia > 0 && distancia < Math.abs(radio1-radio2)) {
      System.out.println("Las circunferencias son interiores");
    }
    else if (distancia == Math.abs(radio1-radio2) ) {
      System.out.println("Las circunferencias son tangentes interiores");
    } else {
      System.out.println("Ha habido algún error al calcular");
    }
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  } 
}