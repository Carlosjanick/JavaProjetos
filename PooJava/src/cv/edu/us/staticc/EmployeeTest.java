package cv.edu.us.staticc;
//Demostração do membro static.

public class EmployeeTest {
    public static void main(String[] args) {
        //mostra que a contagem é 0 antes de criar Employees.
        System.out.printf("Employees before instantiation: %d\n", Employee.getCount());
        
        //cria dois Employees: a contagem deve ser 2
        Employee e1 = new Employee("Pina", "Carlos");
        Employee e2 = new Employee("Taveres", "Ivone");
        
        //mostra que a contagem é 2 depois de criar dois Employees
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("Via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("Via Employee.getCount(): %d\n", Employee.getCount());
        
        //obtém nomes de Employees
        System.out.printf("\nEmployee1: %s %s\nEmployee 2: %s %s\n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
        
        //nesse exemplo, há somente uma referencia a cada Employee,
        //portanto as duas instruçoes seguintes indicam que
        //esses objetos são eligiveis para a coleta de lixo
        e1 = null;
        e2 = null;
    }
}
