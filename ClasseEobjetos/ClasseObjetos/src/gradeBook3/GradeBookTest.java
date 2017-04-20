package gradeBook3;

import java.util.Scanner;

/**
 *
 * @author Carlos-Pina
 */
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdAluno, qtdTeste;
        String nomeCurso;
        
        
        
        //dados dinamicos
        System.out.println("Informe o nome da disciplina: ");
        nomeCurso = ler.nextLine();
        
        
        System.out.println("Informe a quantidade de alunos :");
        qtdAluno = ler.nextInt();
        
        System.out.println("Informe a quantidade de teste :");
        qtdTeste = ler.nextInt();
        
        int[][] gradesArray = new int[qtdAluno][qtdTeste];
        
        for (int linha = 0; linha < gradesArray.length; linha++) {
            System.out.printf("Aluno %d :\n", linha + 1);
            for (int coluna = 0; coluna < gradesArray[linha].length; coluna++) {
                System.out.printf("Informe a nota %d : ", coluna + 1);
                int nota = ler.nextInt();
                gradesArray[linha][coluna] = nota;
            }
            
            System.out.println();
        }
        
        
        
        GradeBook myGradeBook = new GradeBook(nomeCurso, gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.exOperacoes();
    }
}
