/**
 Ejercicio11v2: Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las
# dimensiones de los lados de un triángulo. El programa debe determinar 
# que tipo de triangulo es, teniendo en cuenta los siguiente:
# -Si se cumple Pitágoras entonces es triángulo rectángulo
# -Si sólo dos lados del triángulo son iguales entonces es isósceles.
# -Si los 3 lados son iguales entonces es equilátero.
# -Si no se cumple ninguna de las condiciones anteriores, es escaleno.

#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: Pedir tres variables a, b, c que son los lados de un triangulo
#   y para determinar qué tipo es hacemos los siguientes if, elif y else:
#   -Si a**2 + b**2 == c**2 or a**2 + c**2 == b**2 or b**2 + c**2 == a**2 es restangulo
#   -si a == b != c or a == c != b or b == c != a es isosceles
#   -si a == b == c es equilatero
#   -si a != b != c es escaleno


#   Variables a usar:
#   ladoA: primer lado
#   ladoB: segundo lado
#   ladoC: tercer lado
#  

#   Pasos a Seguir:
#   pedimos los datos
#   Ejecutamos la operaciones
#   Mostramos resultado
#
 */


import java.util.Scanner;

public class Ejercicio11v2 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double ladoA;
    double ladoB;
    double ladoC;


    System.out.println("Hola, esto es un programa para averiguar qué tipo de triangulo es!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame los lados A, B y C del triángulo respectivamente:");
    ladoA = s.nextDouble();
    ladoB = s.nextDouble();
    ladoC = s.nextDouble();
    
    if ( ladoA == ladoB && ladoA == ladoC ) {
      System.out.println("El triangulo es equilatero");
    } else {
      if (Math.pow(ladoA, 2) + Math.pow(ladoB,2) == Math.pow(ladoC,2) || Math.pow(ladoA, 2) + Math.pow(ladoC,2) == Math.pow(ladoB,2) || Math.pow(ladoB, 2) + Math.pow(ladoC,2) == Math.pow(ladoA,2)) {
        System.out.println("El triangulo es rectangulo");
      }
      if ( (ladoA == ladoB && ladoA !=  ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA) ) {
        System.out.println("El triangulo es isosceles");
      } else {
        System.out.println("El triangulo es escaleno");
      }
    }
    

    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  } 
}