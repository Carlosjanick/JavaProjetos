package Fatorial.gui;

/**
 *
 * @author Carlos.J.Pina
 */
public class Fatorial {
    int resultado = 1;
    int num;
    String formula;
    String carater;
    
    public void calcularFatorial(int n){
        num = n;
        formula = "";
        
        for(int i = n; i >= 1; i--){
            resultado *= i;
            
            if (i == 1){
                carater = " = ";
            }else{
                carater = " x ";
            }
            formula += i+ carater;
        }
        
    }
    
    public int getNum(){
        return num;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public String getFormula(){
        return formula;
    }
}
