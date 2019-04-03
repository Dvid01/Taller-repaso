 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ej4 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        
        double base;
        System.out.println("Inserte la base del triangulo");
        base= entrada.nextDouble();
         double altura;
        System.out.println("Inserte la altura del triangulo");
        altura=entrada.nextDouble();
        double resultado=base*altura;
        double resultado2=resultado/2;
        System.out.println(resultado2);
    
    
    
    
    }
    
}
