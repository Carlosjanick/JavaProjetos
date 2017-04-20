package acount;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class AcountTest {
    public static void main(String[] args) {
       //cria objeto do tipo Account 
       Account account1 = new Account( 50.00 );
       Account account2 = new Account( -7.53 );
       
       //exibe saldo inicial de cada objeto.
       System.out.printf("Account balance: %.2f\n", account1.getBalance());
       System.out.printf("Account balance: %.2f\n", account2.getBalance());
        
       //cria scanner para obter entrada apartir de janela de comando.
       Scanner input = new Scanner(System.in);
       double depositAnmount; // guarda a quantidade depositada pelo utilizador.
       
       
       //conta 1 deposito
       System.out.println("Informe a quantidade a depositar ?");
       depositAnmount = input.nextDouble(); //entrada do utilizador
        
       System.out.printf("Adcionou %.2f para a conta2 \n", depositAnmount);
       account1.credit(depositAnmount); // adiciona o saldo a conta1.
       /////
       
       //exibe os saldos
       System.out.printf("Account1 balance: %.2f \n", account1.getBalance());
       System.out.printf("Account2 balance: %.2f \n", account2.getBalance());
        
       
       //deposito conta 2
       System.out.println("Informe a quantidade a depositar ?");
       depositAnmount = input.nextDouble(); //entrada do utilizador
       
       System.out.printf("Adcionou %.2f para a conta1 \n", depositAnmount);
       account2.credit(depositAnmount); // adiciona o saldo a conta2
        
       
        //exibe os saldos
       System.out.printf("Account1 balance: %.2f \n", account1.getBalance());
       System.out.printf("Account2 balance: %.2f \n", account2.getBalance());
    }    
}
