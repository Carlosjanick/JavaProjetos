package gradeBook;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class GradeBookTest {
    public static void main(String[] args) {
        //cria um objeto GradeBook e o atribui a myGradeBook
        GradeBook myGradeBook = new GradeBook("Introdução ao Java");
        
        
        //responsavel pela recolha de valor
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome de um Curso!");
        String nomeCurso = input.nextLine();
        
        myGradeBook.setCourseName(nomeCurso);//configura nome do curso
         
        //chama método displayMessage de myGradeBook
        myGradeBook.displayMessage();
        

        
        
    } //fim de main
} //fim da classe GradeBookTest
