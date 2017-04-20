package cv.edu.us.composicao;

/**
 *
 * @author Carlos-Pina
 */
public class Date {

    private int month; // 1-12
    private int day; // 1-31 comforme o més
    private int year; // qualquer ano

    //construtor: chama checkMonth para configurar o valor adequado para month:
    //chama checkDay para configurar o valor adequado para day
    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth); //valida moth
        year = theYear; //poderia validar year
        day = checkDay(theDay); //valida day
    }

    //metodo utilitario para configurar o valor adequado de month
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) {//valida month
            return testMonth;
        } else {//month é invalido
            System.out.printf("Invalid month (%d) set to 1", testMonth);
            return 1;
        }
    }
    
    /*
    public int getMonth(){
        return this.month;
    }
    */
    //metodo utilitario para confirmar o valor adequado de day com base em month e year
    private int checkDay( int testDay ){
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //verifica se day esta no entervalo para month
        if( testDay > 0 && testDay <= daysPerMonth[month]){
            return testDay;
        }
        
        //verifica no bissexto
        if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            return testDay;
        }
        
        System.out.printf("Invalid day (%d) set to 1.", testDay);
        return 1; //mantem o objeto no estado consistente
    }
    
    //retorna uma string no formato mes/dia/ano
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
