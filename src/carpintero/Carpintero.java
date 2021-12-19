
package carpintero;

import java.util.Scanner;


public class Carpintero {

   
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in); 
   int lon,ancho,cantca,madera=0;
    boolean salir=false;
    
  
   
  System.out.print("Ingrese longitud:"); 
  lon = teclado.nextInt();     
  System.out.print("Ingrese ancho:"); 
  ancho = teclado.nextInt(); 
  System.out.print("Ingrese cant cajones a añadir (precio $300):"); 
  cantca = teclado.nextInt();     
  System.out.println("Ingrese tipo de madera");
 
  while(!salir)
   {
   salir=true;
   System.out.println("1.Caoba +1500:"); 
   System.out.println("2.Roble +1250:"); 
   System.out.println("3.Pino  +0:"); 
   System.out.println("4.Salir:"); 
   System.out.println("Indica la opcion:"); 
  madera=teclado.nextInt();
  
Escritorio e= new Escritorio(lon,ancho,cantca,madera);
   System.out.println("El precio del escritorio seria $"+e.CalcularPrecio());
 
     
    }
   
    
}
}


