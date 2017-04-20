package vetor.array;

import java.util.Arrays;

/**
 *
 * @author Carlos.J.Pina
 */
public class Vetor03 {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        
        Arrays.sort(v); //vetor em ordem
        
        for(double valor: v){
            System.out.print(valor + " ");
        }
    }
}
