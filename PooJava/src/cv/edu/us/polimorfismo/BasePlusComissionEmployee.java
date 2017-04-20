package cv.edu.us.polimorfismo;

//membros private da superclasse não podemser acessados em uma subclasse
//membros private da superclasse não podemser acessados em uma subclasse
public class BasePlusComissionEmployee extends CommissionEmployee{
    private double baseSalary; //salario-base por semana
    
    //construtor
    public BasePlusComissionEmployee(String first, String last,
        String ssn, double sales, double rate, double salary){
        
        //chama explicita para o construtor ComissionEmployee da superclasse
        super(first, last, ssn, sales, rate);
        
        this.setBaseSalary(salary);//valida e armanzena salario-base
    }
    
    
    //configura salario-base
    public void setBaseSalary( double base ){
        this.baseSalary = (base < 0.0) ? 0.0 : base;
    }
    
    //retorna salario-base
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    //calcula os lucros
    public double earnings(){
        return this.baseSalary +  super.earnings();
    }
    
    //retorna a representação de String de BasePlusComissionEmployee
    @Override //indica que esse metodo sobrescreve um metodo da superclasse
    public String toString(){
        return String.format(
                "%s: %s \n%s: %.2f",
                "base-salaried",
                super.toString(),
                "base salary", getBaseSalary());
    }
}
