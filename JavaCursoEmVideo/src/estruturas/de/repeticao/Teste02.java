package estruturas.de.repeticao;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class Teste02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n,i;
        i = 1;
        int nota;
        int totalNota = 0;
        
        System.out.println("Didite o total de notas a inserir ?");
        n = ler.nextInt();
        
        System.out.println("Digite a nota "+i);
        nota = ler.nextInt();
        
        totalNota += nota;
        while(i < n){
            System.out.println("Digite a nota "+(i+1));
            nota = ler.nextInt();
            totalNota += nota;
            i++;
        }
        
        
        double media = totalNota/i;
        
        System.out.println("Media: "+media);
        System.out.println("total inserido: "+ i);
        System.out.println("Total soma: "+totalNota);
    }
}
