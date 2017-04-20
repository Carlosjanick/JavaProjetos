package cv.edu.us.heranca01;

/**
 *
 * @author Carlos-Pina
 */
//classe CommissionEmployee representa um funcionario que recebeu uma
//percentagem das vendas brutas.
public class CommissionEmployee extends Object{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais
    private double comissionRate; //percentagem da comissão
    
    //construtor de cinco argumentos
    public CommissionEmployee( String first, String last, String ssn, double sales, double rate){
        //chamada implicita para o construtor Object ocorre aqui
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);//valida e armanzena as vendas brutas
        setComissionRate( rate );//valida e armanzena a taxa de comissão
    }// fim do construtor
    
    //configura o nome
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//fim do metodo setFirstName
    
    //retona o nome
    public String getFirstName() {
        return firstName;
    }//fim do metodo getFirstName

    //configura o sobrenome    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//fim do metodo setLastName
    
    //retorna o sobrenome
    public String getLastName() {
        return lastName;
    }//fim do metodo getLastName
    
    //configura o SIC
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }//fim do metodo setSocialSecurityNumber

    //retorna o SIC
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }//fim do metodo getSocialSecurityNumber
    
    //configura a quantidade de vendas brutas
    public void setGrossSales(double sales) {
        this.grossSales = ( sales < 0.0 ) ? 0.0 : sales;
    }//fim do metodo setGrossSales
    
    //retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }//fim do metodo getGrossSales
       
    //configura a taxa de emissão
    public void setComissionRate(double rate) {
        this.comissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }//fim do metodo setComissionRate
    
     //retorna a taxa de emissão
    public double getComissionRate(){
        return this.comissionRate;
    }//fim do metodo getComissionRate

    //calcula os lucros
    public double earnings(){
        return this.comissionRate * this.grossSales;
    }//fim do metodo earnings
    
    //retorna a representação String do objeto CommissionEmployee
    @Override //indica que esse metodo sobrescreve um metodo de superclasse
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n",
                "Comission employee", this.firstName, this.lastName,
                "Social security number", this.socialSecurityNumber,
                "gross sales", this.grossSales,
                "comission rate", this.comissionRate);
    }//fim do metodo toString
    
}//fim da classe CommissionEmployee
