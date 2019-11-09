/**
 * Ejercicio 20
Una compañía de transporte internacional tiene servicio en algunos países 
de América del Norte, América Central, América del Sur, Europa y Asia. 
El costo por el servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigido. Lo anterior se muestra en la tabla:

ZONA	UBICACIÓN	COSTO/GRAMO
1	América del Norte	24.00 euros
2	América Central	20.00 euros
3	América del Sur	21.00 euros
4	Europa	10.00 euros
5	Asia	18.00 euros
Parte de su política implica que los paquetes con un peso superior a 5 kg 
no son transportados, esto por cuestiones de logística y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, 
en su caso, el rechazo de la entrega.

#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019

#   Algoritmo: pedimos las variables peso y zona. La zona pedirá especificamente
    la zona de destino con un print. Avisaremos usando un if que el peso debe ser
    menor de 5000 gramos. Luego le aplicamos el precio segun cada zona al peso del
    paquete y mostramos resultado.

#   Variables a usar:
#   peso: peso del paquete, debe ser igual o menor a 5 kilogramos
#   zona: lugar del mundo donde quiere ser enviado el paquete
#


#   Pasos a Seguir:
#   pedimos los datos donde se especifica la zona
#   comprobamos y ejecutamos 
#   mostramos resultado
 */
import java.util.Scanner;

public class Ejercicio20 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int zona;
    double peso;


    System.out.println("Hola, esto es un programita para averiguar el costo de su envio!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el peso exacto del paquete(en Gramos): ");
    peso = s.nextDouble();

    System.out.println("\nElija la zona de destino:\n1.America Del Norte\n2.America Central\n3.America Del Sur\n4.Europa\n5.Asia\n");
    System.out.println("Inserte zona donde quiere mandar el paquete(1-5): ");
    zona = s.nextInt();


    if (peso > 5000){
      System.out.println("El peso de su paquete excede el maximo, no es permitido");
    } 
    else if (zona == 1) {
      System.out.printf("Usted ha elegido America del Norte y el costo en euros es de %.2f\n", peso*24);
    }
    else if (zona == 2) {
      System.out.printf("Usted ha elegido America del Norte y el costo en euros es de %.2f\n", peso*20);
    }
    else if (zona == 3) {
      System.out.printf("Usted ha elegido America del Norte y el costo en euros es de %.2f\n", peso*21);
    }
    else if (zona == 4) {
      System.out.printf("Usted ha elegido America del Norte y el costo en euros es de %.2f\n", peso*10);
    }
    else if (zona == 5) {
      System.out.printf("Usted ha elegido Asia y el costo en euros es de %.2f\n", peso*18);
    } else {
      System.out.println("Se ha equivocado de selección de zona de destino");
    }
      
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}