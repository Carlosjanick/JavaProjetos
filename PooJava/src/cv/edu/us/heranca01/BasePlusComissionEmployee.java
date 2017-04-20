package cv.edu.us.heranca01;

//a classe BasePlusComissionEmployee representa um empregado que
//recebe um salario-base além da comisão
public class BasePlusComissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;//vendas brutas semanais
    private double commissionRate; //porcentagem da comissão
    private double baseSalary; //salario-base por semana
    
    //construtorde seis argumentos 
    public BasePlusComissionEmployee(String first, String last,
        String ssn, double sales, double rate, double salary){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        
        this.setGrossSales(sales);//valida e armanzena as vendas brutas
        this.setCommissionRate(rate);//valida e armanzena a taxa de comissão
        this.setBaseSalary(salary);//valida e armanzena salario base
    }//fim do construtor BasePlusComissionEmployee de seis argumentos
    
    //configura o nome 
    public void setFirstName( String first ){
        this.firstName = first;
    }
    
    //retorna o nome
    public String getFirstName(){
        return this.firstName;
    }
    
    //configura o sobrenome
    public void setLastName( String last ){
        this.lastName = last;
    }
    
    //retorna o sobrenome
    public String getLastName(){
        return this.lastName;
    }
    
    //configura ssn
    public void setSocialSecurityNumber( String ssn ){
        this.socialSecurityNumber = ssn; //deve validar
    }
    
    //retorna ssn
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    //configura a quantidade de vendas
    public void setGrossSales( double sales ){
        this.grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    }
    
    //retorna a quantidade de vendas
    public double getGrossSales(){
        return this.grossSales;
    }
    
    //configura a taxa de comisão
    public void setCommissionRate( double rate ){
        this.commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }
    
    //retorna a taxa de comisão
    public double getCommissionRate(){
        return this.commissionRate;
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
        return this.baseSalary + (this.commissionRate * this.grossSales );
    }
    
    //retorna a representação de String de BasePlusComissionEmployee
    @Override //indica que esse metodo sobrescreve um metodo da superclasse
    public String toString(){
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f ", 
                "base-salaried commission employee", this.firstName, this.lastName,
                "social security number", this.socialSecurityNumber,
                "gross sales", this.grossSales,
                "commission rate", this.commissionRate,
                "base salary", this.baseSalary);
    }
}
