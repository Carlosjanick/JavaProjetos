package estruturas.de.repeticao;

import java.util.Scanner;


/**
 *
 * @author Carlos.J.Pina
 */
public class Teste03 {

    public static void main(String[] args) {
        Scanner  ler  = new Scanner(System.in);
        
        int contadorNota = 0;
        double totalNota = 0;
        double nota;
        double media;
        
        String op;
        
        do{
            System.out.println("Pretende continuar precione [s/n]!"); 
            op = ler.next();
            
            if(op.equals("s")){
                System.out.println("Digite a nota "+(contadorNota+1)); 
                nota = ler.nextDouble();
                
                totalNota += nota;
                contadorNota++;
            }
            
        }while(op.equals("s"));
        
        if(contadorNota != 0){
            media = totalNota / contadorNota;
            System.out.println("Somatorio Notas: "+String.format("%.2f", totalNota));
            System.out.println("Contador: "+contadorNota);
            System.out.println("Media: "+String.format("%.3f", media));
        }else{
            System.out.println("Abordou o programa com sucesso...");
        }
    }
}
