package classeobjetos;

/**
 *
 * @author Carlos-Pina
 */
public class MaiorNum {
    
    public double maxiValor(double nun1, double nun2, double nun3 ){
        double maxValor = Math.max(nun1, Math.max(nun2, nun3));
        
        return maxValor;
    }
}
