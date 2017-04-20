package cv.edu.us.composicao;

/**
 *
 * @author Carlos-Pina
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 78, 1949);
        Date hire = new Date(3, 12, 1988 );
        
        Employee employee = new Employee("Pina", "Carlos", birth, hire);
        
        System.out.println(employee);
        //System.out.println("--->"+employee.getBirthDate().getMonth());
        
    }
}
