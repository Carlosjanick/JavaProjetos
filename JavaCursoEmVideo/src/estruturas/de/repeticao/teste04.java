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
public class teste04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nun, fact = 1;
        int i = 1;
        
        System.out.println("Informe um um numero !");
        nun = ler.nextInt();
       
        while(nun >= 1){
            fact *= nun;
            
            nun--;
        }
        
        System.out.println("Factorial: "+fact);
        
    }
}
