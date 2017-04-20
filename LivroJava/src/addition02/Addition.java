package addition02;

import java.util.Scanner; //Programa utiliza a classe  Scanner

/**
 *
 * @author Carlos.J.Pina
 */
public class Addition {
    public static void main(String[] args) {
        // cria um Scanner para obter entrada da janela de comando
        Scanner entrada = new Scanner(System.in);
        
        int  nun1, nun2, sum;
        
        System.out.println("Enter first number: ");
        nun1 = entrada.nextInt(); //lé o primeiro numero fornecido e armanzena o valor na variavel nun1
        
        System.out.println("Enter a second number: ");
        nun2 = entrada.nextInt(); //lé o segundo numero fornecido e armanzena na variavel nun2
  
        sum = nun1 + nun2; //Soma  os numeros, depois armanzena o total na variavel sum
    
        System.out.println("O resultado da soma entre " + nun1 + " e " + nun2 + " é igual a "+sum);
    }
}
