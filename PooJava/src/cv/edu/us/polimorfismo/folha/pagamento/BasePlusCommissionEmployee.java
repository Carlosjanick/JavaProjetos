package cv.edu.us.polimorfismo.folha.pagamento;

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
    
    //calcula os vencimentos: sobrescreve o metodo earnings em CommissionEmployee
    @Override
    public double earnings(){
        return this.getBaseSalary() + super.earnings();
    }
    
    //retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s %s; %s: %.2f", 
                "base-salaried", super.toString(),
                "base salary", this.getBaseSalary());
    }
    
}//fim da classe BasePlusCommissionEmployee
