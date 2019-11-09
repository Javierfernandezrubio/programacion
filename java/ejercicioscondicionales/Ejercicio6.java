/**
 Ejercicio6: Programa que lea una cadena por teclado y compruebe si es una 
# letra mayúscula.
# 
#
# Autor: Javier Fernández Rubio
#
#   Fecha: 6/11/2019
#
#   Algoritmo: pedimos un texto, que sera una cadena. Dicha cadena la 
#   compararemos con cadena.upper()[0:1], que es coger el primer caracter
#   de la cadena y ver si es mayuscula o no. Luego mostramos resultado
#
#
#   Varianles a usar:
#   cadena
#
#
#   Pasos a Seguir:
#   pedimos una cadena que sera una cadena de caracteres
#   Comprobamos si es una letra mayuscula al analizar el primer caracter
#   de la cadena
#   Mostramos un resultado o un error
 */


import java.util.Scanner;

public class Ejercicio6 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadena;
    System.out.println("Hola, esto es un programa para averiguar si es una letra mayuscula o no!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame una cadena: ");
    cadena = s.nextLine();
    

    if ((cadena.length() == 1) && (cadena.equals(cadena.toUpperCase()))) {
      System.out.println("Lo que has escrito es una letra mayuscula");
    } else {
      System.out.println("Lo que has escrito NO es una letra mayuscula");
    }
      
    
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}