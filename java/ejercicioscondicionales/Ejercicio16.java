/**
 Ejercicio16: La política de cobro de una compañía telefónica es: cuando se realiza una llamada,
#   el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos 
#   cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos,
#   y a partir del décimo minuto, 50 céntimos. 
#   Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana,
#   15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto
#   una persona que realiza una llamada.




#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: pedimos al usuario el tiempo de llamada, el dia de la semana y el turno del dia(menos si es domingo)
#   de 0 a 5: 1 euro
#   de 5 a 8: 0.8
#   de 8 a 10: 0.7
#   de a partir de 10: 0.5 euros
#   dia de la semana:
#           +3% domingo
#        si no
#           por la mañana 15%
#           por la tarde 10%
#   si la llamada es mayor de 10 mint, 3 euros
#   si la llamada es mayor de 8 mint, 2.5
#   si la llamada es mayor de 5 minut, 1.8
#   si la llamada es menor de 5 minut, 1
#   si el dia es domingo aplicamos un 3%, si no lo es, l preguntamos si es por la mañana o tarde, y aplicamos 15 o 10%




#   Variables a usar:
#   time: duracion llamada
#   dia: dia de la semana
#   turnoDia: mañana o tarde
#   coste: precio de la llamada base por tramos
#
#


#   Pasos a Seguir:
#   pedimos los datos
#   calculamos los datos de time y coste
#   Comprobamos con if, else if y else
#   Mostramos resultado
 */
import java.util.Scanner;

public class Ejercicio16 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double time;
    Character dia;
    String turnoDia;
    double coste;


    System.out.println("Hola, esto es un programa para averiguar el gasto de tu llamada!!!");
    System.out.println("-------------------------------------------------------");

    
    System.out.println("Dame el tiempo de la duaracion de la llamada(minutos): ");
    time = s.nextDouble(); s.nextLine();
    System.out.println("Dame el día de la semana(L,M,X,J,V,S,D): ");
    dia = s.nextLine().charAt(0);
    turnoDia = ""; //Aquí le doy un valor inicial a esta variable(me da error de compilación si no se lo doy)
    if (dia.compareTo('D')<0 || dia.compareTo('D')>0 ) {
      System.out.println("Dame el tramo del día cuando se hizo la llamada(mañana/tarde): ");
      turnoDia = s.nextLine();
    }

    coste = 0; //Aquí le doy un valor inicial a esta variable(me da error de compilación si no se lo doy)
    if (time >= 10){
      coste = 3;
    }
    else if (time >= 8) {
      coste = 2.5;
    }
    else if (time >= 5) {
      coste = 1.8;
    }
    else if (time < 5) {
      coste = 1;
    }


    if (dia.equals('D')) {
      System.out.printf("El coste de tu llamada es de %.2f \n", coste*0.03 + coste );
    }
    else if (turnoDia.equals("mañana")) {
      System.out.printf("El coste de tu llamada es de %.2f \n", coste*0.15 + coste );
    }
    else if (turnoDia.equals("tarde")) {
      System.out.printf("El coste de tu llamada es de %.2f \n", coste*0.10 + coste );
    }
    
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}