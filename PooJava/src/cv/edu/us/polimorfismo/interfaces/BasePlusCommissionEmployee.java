package cv.edu.us.polimorfismo.interfaces;

//classe BasePlusCommissionEmployee estende a CommissionEmployee
//automaticamente é subclasse indireta da Superclasse Employee
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; //salario base por semana 

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        
        this.setBaseSalary(salary);
    }

    //configura BaseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary; //nao negativo
    }
    
    //retorna BaseSalary
    public double getBaseSalary() {
        return baseSalary;
    }
    
    //calcula vencimentos: implementa o metodo getPaymentAmount
    //SUBSCREVENDO O METODO getPaymentAmount DA SUBCLASSE CommissionEmployee 
    @Override
    public double getPaymentAmount() {
        return this.getBaseSalary() + super.getPaymentAmount();
    }
    
    //retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s %s; %s: %.2f", 
                "base-salaried", super.toString(),
                "base salary", this.getBaseSalary());
    }
    
}//fim da classe BasePlusCommissionEmployee
