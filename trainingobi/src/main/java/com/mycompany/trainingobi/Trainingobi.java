
package com.mycompany.trainingobi;

import java.util.Scanner;

/**
 *
 * @author Rayanne
 */
public class Trainingobi {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int a, b;
       
        System.out.println("Insira o primeiro numero:");
        a = ler.nextInt();
        System.out.println("Insira o segundo numero:");
        b = ler.nextInt();
        
        int c = 2*a-b;
        
        System.out.println(c); 
       
        
        
    }   
}
