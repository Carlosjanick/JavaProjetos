package gradeBook4;

import java.util.Scanner;

/**
 *
 * @author Carlos-Pina
 */
public class LivroNotasTest {
    public static void main(String[] args) {
        
        Scanner ler = new  Scanner(System.in);
        String nomeDisc, aluno;
        int qtdAl = 0, alCodigo = 1, qtdTest;
        
        
        System.out.println("Informe o nome da discilplina: ");
        nomeDisc = ler.nextLine();
        
        System.out.println("Informe a quantidade de Aluno: ");
        qtdAl = Integer.parseInt(ler.nextLine());
        
        Aluno[] arrayNome = new Aluno[qtdAl];
        
        for (int i = 0; i < arrayNome.length; i++) {
              System.out.printf("Informe o nome do Aluno para o codigo %d :\n", alCodigo);
              aluno = ler.nextLine();
              
              arrayNome[i] = new Aluno(alCodigo, aluno);
              
              alCodigo++;
              System.out.println();
        }
        
        
        
        System.out.println("Informe a quantidade de teste :");
        qtdTest = ler.nextInt();
        
        
        int[][] arrayNotas = new int[qtdAl][qtdTest];
        for (int linha = 0; linha < arrayNotas.length; linha++) {
            System.out.printf("Nota do aluno %s:\n", arrayNome[linha]);
            for (int coluna = 0; coluna < arrayNotas[linha].length; coluna++) {
                
                System.out.printf("Nota do %d Teste: ", coluna+1);
                int nota = ler.nextInt();
                arrayNotas[linha][coluna] = nota;
            }
            
            System.out.println();
        }
        
        LivroNotas meuLivro = new LivroNotas(nomeDisc, arrayNotas, arrayNome);
        meuLivro.apresentaMensagem();
        meuLivro.exOperacoes();
    }
}
