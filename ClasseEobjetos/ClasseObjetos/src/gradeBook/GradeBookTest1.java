package gradeBook;

/**
 *
 * @author Carlos.J.Pina
 */
public class GradeBookTest1 {
    public static void main(String[] args) {
        GradeBook nota = new GradeBook("Programação Java!");
        
        nota.displayMessage();
        
        nota.inputGrades();
        nota.displayGradeReport();
    }
}
