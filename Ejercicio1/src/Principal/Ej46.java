
package ej46;

import java.util.Scanner;

public class Ej46 {

 
    public static void main(String[] args) {
 int suma=0;
       int b;
       float r=0;
       Scanner entrada=new Scanner(System.in);
        System.out.println("Hasta que numero desea hacer la operacion");
         b= entrada.nextInt();
           System.out.println("");
        System.out.println("");
       for(int i=1;i<=b;i++){
           suma=suma+i;
           System.out.println(suma);
       }
       r=suma/b;
        System.out.println("El "+r);
   }
}
