package cv.edu.us._final;
public class Increment {
    private int total = 0; // total de todos os incrementos
    private final int INCREMENT; //Variavel constante (não inicializada)
    
    //construtor inicializa variavel de instancia final INCREMENT
    public Increment( int incrementValue ){
        INCREMENT = incrementValue; //inicializa variavel constante (uma vez)
    }
    
    //adiciona INCREMENT ao total
    public void addIncrementToTotal(){
        total += INCREMENT;
    }
    
    //retorna representação de string dos dados de um objeto Increment
    public String toString(){
        return String.format("total = %d", total);
    }
}
