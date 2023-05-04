/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package training;

import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class OrdenarVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vet[] = new int[8];
        int troca = 0;
        
        System.out.println("Tamanho do vetor:"+vet.length);
        
        //atributting values
        vet[0]=2;
        vet[1]=13;
        vet[2]=10;
        vet[3]=3;
        vet[4]=8;
        vet[5]=99;
        vet[6]=6;
        vet[7]=17;
        
        Arrays.sort(vet);
        System.out.println(Arrays.toString(vet));
        
        
    }
}
