/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38;

import java.util.Scanner;

/**
 *
 * @author luisdavid
 */
public class Ej42 {
    public static void main (String[]args){
       int suma=0;
       int b;
       Scanner entrada=new Scanner(System.in);
        System.out.println("Hasta que numero desea hacer la suma?");
         b= entrada.nextInt();
           System.out.println("");
        System.out.println("");
       for(int i=1;i<=b;i++){
           suma=suma+i;
           System.out.println(suma);
       }
   }
}
