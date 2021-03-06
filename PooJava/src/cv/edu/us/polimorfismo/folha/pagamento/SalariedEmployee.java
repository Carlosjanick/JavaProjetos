package cv.edu.us.polimorfismo.folha.pagamento;

//A classe concreta SalariedEmployeeestende a classe Employee abstrata
public class SalariedEmployee extends Employee{
    private double weeklySalary; //salario semanal

    //construtor com 4 argumentos 
    public SalariedEmployee(String first, String last, String ssn, double wekSal) {
        super(first, last, ssn); //passa para o construtor Employee
        
        this.setWeeklySalary(wekSal); //valida e armanzena o salario
    }
    
    
    //configura weeklySalary
    public void setWeeklySalary( double salary ){
        this.weeklySalary = (salary < 0.0) ? 0.0 : salary;
    }
    
    //retorna weeklySalary
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    
    //calcula os rendimentos: sobrescreve o metodo earnings em Employee
    @Override
    public double earnings() {
        return this.getWeeklySalary();
    }
    
    //retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString(){
       return String.format("Salaried employee: %s\n%s: %.2f", 
               super.toString(),
               "weekLy salary",
               this.getWeeklySalary());
    }
    
}
