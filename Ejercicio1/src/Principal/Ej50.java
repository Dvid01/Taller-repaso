/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej48;

/**
 *
 * @author estudiantes
 */
public class Ej50 {
    public static void main(String[] args) {
        int i=0,d=0;
        int b=0,c=0;
        do{
            i++;
            if(i%2==0){
                b=b+i;
            }
            
        }while(i<=200);
        do{
            d++;
             if (d%2!=0){   
          
                c=c+d;
                
            }
        }while(d<=199);
        System.out.println("La suma de los numeros pares fue de: "+b);
        int f=0;
        f=b/100;
        System.out.println("La media de la suma de los numeros pares es de: "+f);
        System.out.println("La suma de los numeros impares fue de: "+c);
        int h=0;
        h=c/100;
         System.out.println("La media de la suma de los numeros impares es de: "+h);

    }
    }

