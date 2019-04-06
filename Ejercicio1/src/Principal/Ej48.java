
package ej48;

import java.util.Scanner;


public class Ej48 {

  
    public static void main(String[] args) {
           Scanner entrada=new Scanner(System.in);
           int i,num,con;
        System.out.println("Digite un numero para saber si es primo");
        num=entrada.nextInt();
        con = 0;
        for(i=1;i<=num;i++){
            if((num % i)==0){
                con++;
            }
        }
        if(con<=2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
}
