package cv.edu.us.polimorfismo.interfaces;

//classe CommissionEmployee estende Employee

public class CommissionEmployee extends Employee{
    private double grossSales; //vendas brutas semanais
    private double commissionRate; //porcentagem de comissão

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn);
        
        this.setCommissionRate( rate );
        this.setGrossSales( sales );
    }

    //configura GrossSales
    public void setGrossSales(double grossSales) {
        this.grossSales = ( grossSales < 0.0 ) ? 0.0 : grossSales;
    }
    
    //retorna GrossSales
    public double getGrossSales() {
        return this.grossSales;
    }

    //configura CommissionRate
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = ( commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }
    
    //retorna CommissionRate
    public double getCommissionRate() {
        return this.commissionRate;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: %.2f; %s: %.2f",
                "Commision employee", super.toString(),
                "gross sales", this.getGrossSales(),
                "commission rate", this.getCommissionRate());
    }

    //calcula vencimentos: implementa o metodo Payable da
    //interface que era abstrata na superclasse EMPLOYE
    @Override
    public double getPaymentAmount() {
        return this.getCommissionRate() * this.getGrossSales();
    }
    
}
