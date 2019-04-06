/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej48;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Ej52 {
    
    public static void main(String[] args) {
        int b=0,c=0;
       Scanner num=new Scanner(System.in);
       
       for(int i=1;i<=10;i++){
           System.out.println("Digite el "+i+" numero");
           b = num.nextInt();
           if (b<0){
               c=c+b;
           }
       }
       
           System.out.println("El resultado es "+c);
     
    }
}
