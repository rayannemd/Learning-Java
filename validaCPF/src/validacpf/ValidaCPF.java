/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacpf;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ValidaCPF {
    /**
     *
     * @param CPF
     * @return
     */
    public static boolean isCPF(String CPF){
        
         if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || 
            CPF.equals("33333333333") ||
            CPF.equals("44444444444") || 
            CPF.equals("55555555555") ||
            CPF.equals("66666666666") || 
            CPF.equals("77777777777") ||
            CPF.equals("88888888888") || 
            CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);
        
        char dig1, dig2;
        int sm, i, num, peso, resposta;
        
        try{
            sm = 0;
            peso = 10; //dig1
            
            for (i=0; i<9; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
            
            sm = 0;
            peso = 11; //dig2
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
            
            resposta = 11 - (sm % 11);
            if ((resposta == 10) || 
                (resposta == 11))
                dig2 = '0';
            else dig2 = (char)(resposta + 48);
            
           } catch (InputMismatchException erro) {
                return(false);     
    }
        return(true);
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.println("Informe o seu CPF para validacao (somente numeros): ");
        CPF = ler.next();
        
        if (ValidaCPF.isCPF(CPF) == true)
             System.out.println("CPF Valido");
        else System.out.println("CPF Invalido");
    }
}
      
