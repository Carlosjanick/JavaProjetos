package gradeBook1;

/**
 *
 * @author Carlos-Pina
 */
public class GradeBookTest {
    public static void main(String[] args) {
        //array de notas de aluno
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
       
        GradeBook myGradeBook = new GradeBook("Java Programing", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
