/**
 Ejercicio14: La asociación de vinicultores tiene como política fijar un precio inicial
# al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
# Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño,
# se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque,
# considerando lo siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial
# cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 
# céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
# Realice un algoritmo para determinar la ganancia obtenida.

#   Autor: Javier Fernández Rubio
#
#   Fecha: 7/11/2019
#
#   Algoritmo: 



#   Variables a usar:
#   price: precio inicial
#   kile: kilos de uvas embarcadas
#   type: tipo de uva A o B
#   size: tamaño de la uva 1 o 2
#
#


#   Pasos a Seguir:
#   pedimos los datos
#   Comprobamos con if, else if; y calculamos el precio final
#   Mostramos resultados
 */

import java.util.Scanner;

public class Ejercicio14 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double price;
    double kile;
    Character type;
    Character size;
    Character typeA = 'A';
    Character typeB = 'B';
    Character size1 = '1';
    Character size2 = '2';


    System.out.println("Hola, esto es un programa para averiguar la ganancia obtenid del viñedo!!!");
    System.out.println("-------------------------------------------------------");

    System.out.println("Dame el precio inicial fiajado(euros) y los kilos de uvas: ");
    price = s.nextDouble();
    kile = s.nextDouble();
    System.out.println("Ahora dame el tipo(A/B):");
    type = s.next().charAt(0);
    System.out.println("Ahora dame el tamaño (1/2):");
    size = s.next().charAt(0);


    if ( type.equals(typeA) && size.equals(size1) ){
      System.out.printf("El precio final es de %.2f \n", kile*(price+0.2));
    }
    else if ( type.equals(typeA) && size.equals(size2) ) {
      System.out.printf("El precio final es de %.2f \n", kile*(price+0.3));
    }
    else if ( type.equals(typeB) && size.equals(size1) ) {
      System.out.printf("El precio final es de %.2f \n", kile*(price-0.3));
    }
    else if ( type.equals(typeB) && size.equals(size2) ) {
      System.out.printf("El precio final es de %.2f \n", kile*(price-0.5));
    }
    
    System.out.println("-------------------------------------------------------");
    System.out.println("Gracias por usarme ;)");
    s.close();
  }  
}