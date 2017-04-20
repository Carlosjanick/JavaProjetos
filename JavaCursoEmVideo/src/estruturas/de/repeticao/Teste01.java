/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.repeticao;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class Teste01 {
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);
        
        int totalNota = 0;
        int  contadorNota = 0;
        int nota;
        double media;
        
        System.out.println("Informe a nota ou -1 para finalizar!");
        nota = entrada.nextInt();
        
        while(nota != -1){
            totalNota += nota;
            contadorNota++;
            
            System.out.println("Informe a nota ou -1 para finalizar!");
            nota = entrada.nextInt();
        }
        
        if(contadorNota != 0){
            media = totalNota/contadorNota;
            System.out.println("A media das  notas é "+String.format("%.2f", media));
            System.out.println("O total inserido foi :"+contadorNota+" totalizando o calculo em "+totalNota);
        }else{
            System.out.println("Não informou nehuma nota!");
        }
        
    }
}
