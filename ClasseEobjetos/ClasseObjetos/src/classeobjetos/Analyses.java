package classeobjetos;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class Analyses {
    public static void main(String[] args) {
        Scanner  ler = new  Scanner(System.in);
        
        int aprovado = 0;
        int reprovado = 0;
        int contAluno = 1;
        int tipoNota; //1 ou 2 1-> aprovado e 2 para reprovado
        
        while(contAluno <= 10){
            System.out.println("Informe o tipo de nota [1 para aprovado e 2 para reprovado]!");
            tipoNota = ler.nextInt();
            
            if(tipoNota == 1){
                aprovado += 1;
            }else{
                reprovado += 1;
            }
            contAluno++;
        }
        
        
        System.out.println("Reprovaram  "+reprovado+" e aprovaram "+aprovado+" alunos ");
        if(aprovado >= 8){
            System.out.println("Bonus para o instrutor!");
        }
        
    }
}
