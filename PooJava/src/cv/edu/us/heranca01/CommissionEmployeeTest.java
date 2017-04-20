package cv.edu.us.heranca01;

/**
 *
 * @author Carlos-Pina
 */
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Pina", "Carlos", "222-22-2222", 10000, .06);
        
        //obtem os dados de empregado comissionado
        System.out.println("Employee information obtained by get methods: \n");
        
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is ", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is ", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commissionrate is ", employee.getComissionRate());
        
        
        employee.setGrossSales(500); //configura vendas brutas
        employee.setComissionRate(1); //configura a taxa de emissão
        
        System.out.printf("\n%s: \n\n%s\n", "update employee information obtained by toString",  employee);
    }
}
