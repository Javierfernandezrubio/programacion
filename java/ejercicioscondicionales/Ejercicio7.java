/**
  Ejercicio7: Programa que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
#   -El exponente sea positivo, sólo tienes que imprimir la potencia.
#   -El exponente sea 0, el resultado es 1.
#   -El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
# 
#
# Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: pedimos la base y el exponente. Comprobamos si exp es 
#   mayor que 0, entonces hacemos la ptencia; si exp es menor que 0
#   hacemos la operacion 1/(base**abs(exp), donde abs es poner el exp en
#   su absoluto. Si el exp es igual a 0 mostrar que el resultado es 1.
#
#   Variables a usar:
#   base: base de la potencia
#   exp: exponente de  la potencia
#
#   Pasos a Seguir:
#   pedimos base y exponente
#   Comprobamos con if, else if y else
#   Mostramos los diversos resultados
 */
import java.util.Scanner;

public class Ejercicio7 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base;
    double exp;
    System.out.println("Hola, esto es un programa para averiguar una potencia:!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame 1º el valor de la base y luego del exponente: ");
    base = s.nextDouble();
    exp = s.nextDouble();
    

    if (exp > 0) {
      System.out.printf("El resultado es %.3f \n", Math.pow(base, exp));
    }
    else if (exp < 0) {
      System.out.printf("El resultado es %.3f \n", 1/(Math.pow(base,Math.abs(exp))));
    } else {
      System.out.println("El  resultado de la potencia es 1");
    }
      
    
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}