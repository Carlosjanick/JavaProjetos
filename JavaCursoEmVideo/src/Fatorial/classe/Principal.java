package Fatorial.classe;

/**
 *
 * @author Carlos.J.Pina
 */
public class Principal {
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        f.calcularFatorial(5);
        
        System.out.println(f.getFormula());
        
        System.out.println("Factorial de "+f.getNum()+" é igual a "+f.getResultado());
        
    }
}
