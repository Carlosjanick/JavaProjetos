package cv.edu.us.heranca02;

//programa de teste de BaseplusCommissionEmployee
//programa de teste de BaseplusCommissionEmployee
public class BasePlusComissionEmployeeTest {
    public static void main(String[] args){
        //instancia o objeto BasePlusComissionEmployee
        BasePlusComissionEmployee employee = 
                new BasePlusComissionEmployee("Bob", "Levis", "333-33-3333", 5000, .04, 300);
        
        //obtem os dados do empregado commisionado em salario base
        System.out.println("Employee information obtained by getMethods : \n");
        
        System.out.printf("%s %s\n", "First name is",
                employee.getFirstName());
        
        System.out.printf("%s %s\n", "Last name is",
                employee.getLastName());
        
        
        System.out.printf("%s %s\n", "Social security number is",
                employee.getSocialSecurityNumber());
        
        System.out.printf("%s %.2f\n", "Gross sales is",
                employee.getGrossSales());
        
        System.out.printf("%s %.2f\n", "Commision rate is",
                employee.getComissionRate());
        
        System.out.printf("%s %.2f\n", "Base salary is",
                employee.getBaseSalary());
        
        
        employee.setBaseSalary( 1000 );//configura o salario base
        System.out.printf("\n%s:\n\n%s\n",
                "updated employee information obtained by toString",
                employee.toString());
        
    }
}
