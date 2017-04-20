package cv.edu.us.polimorfismo.interfaces;

//classe HourlyEmployee estende Employee
public class HourlyEmployee extends Employee {

    private double wage; //salario por hora
    private double hours; //horas trabalhadas durante a semana

    //construtor de cinco argumentos
    public HourlyEmployee(String first, String last, String ssn, double horlWage, double hoursWorked) {
        super(first, last, ssn);

        this.setWage(horlWage);//valida a remuneração por hora
        this.setHours(hoursWorked);//valida as horas trabalhadas
    }//fim do construtor HourlyEmployee de 5 argumentos

    //configura Wage
    public void setWage(double wage) {
        this.wage = (wage < 0.0) ? 0.0 : wage;
    }

    //retorna Wage
    public double getWage() {
        return this.wage;
    }

    //configura Hours
    public void setHours(double hours) {
        this.hours = ((hours >= 0) && (hours <= 168.0)) ? hours : 0.0;
    }

    //retorna Hours
    public double getHours() {
        return this.hours;
    }
    
    @Override
    public String toString(){
        return String.format("Hourly employee: %s\n%s: %.2f; %s: %.2f",
                                                    super.toString(),
                                                    "Hourly wage",
                                                    this.getWage(),
                                                    "Hours worked",
                                                    this.getHours());
    }

    //calcula vencimentos: implementa o metodo Payable da
    //interface que era abstrata na superclasse EMPLOYE
        @Override
    public double getPaymentAmount() {
        if (this.getHours() <= 40) { //nehuma hora extra
            return this.getWage() * this.getHours();
        } else {
            return 40 * this.getWage() + (this.getHours() - 40) * this.getWage() * 1.5;
        }
    }
    
}//fim da classe HourlyEmployee
