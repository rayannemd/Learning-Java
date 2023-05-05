/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class OrdenarVetor {

    public static void main(String[] args) {
        
        int vet[] = new int[8];
        //int im = buscarmaior(vet);
        
        //System.out.println("Tamanho do vetor:"+vet.length);
        
        //atributting values
        vet[0]=2;
        vet[1]=13;
        vet[2]=10;
        vet[3]=3;
        vet[4]=8;
        vet[5]=99;
        vet[6]=6;
        vet[7]=17;
        
        Arrays.sort(vet); //ascending
        reverse(vet); //reverse of ascending: descending
        lower(vet);
        //buscarmaior(vet);
        System.out.println(Arrays.toString(vet));
        //System.out.println("A posicao do maior elemento e:" + im);
    }

    private static void reverse(int[] vet) {
        int l = vet.length;
 
        for (int i = 0; i < l/2; i++) {
            int temp = vet[i];
            vet[i] = vet[l - i - 1];
            vet[l - i - 1] = temp;
        }
    }

    private static void lower(int[] vet) {
        Scanner read = new Scanner(System.in);
            int maior = 0, menor = 0; 
		
		for(int i = 0; i < vet.length; i++){
			if(vet[i] > maior){ 
			maior = vet[i];
                    }
		}
		for (int j = 0; j < vet.length; j++) {
			if(vet[j] < menor){
			menor = vet[j];
                    }
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
    }
}
