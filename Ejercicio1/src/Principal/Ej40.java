
package pkg38;

import java.util.Scanner;

public class Ej40 {
    public static void main(String[] args) {
        int i=0;
        do{
       Scanner entrada=new Scanner(System.in);
        System.out.println("Desea Seguir Ejecutando el programa? Si(1)o No(2)");
            i= entrada.nextInt();
        }while(i==1);
        System.out.println("Usted eligio finalizar el programa: "+i);
    }
}
