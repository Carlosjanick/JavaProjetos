package cv.edu.us.enum03;

import com.sun.beans.util.Cache;
import java.util.EnumSet;

/**
 *
 * @author Carlos-Pina
 */
public class EnunTestE {
    public static void main(String[] args) {
        //System.out.printf("Sou %s foi fabricado no ano de %s\n",Carros.MC.getTitle(), Carros.MC.getAnoFabrico());
        
        for(Carros c: Carros.values()){
            System.out.printf("%-15s%-10s%-15s\n", c, c.getTitle(), c.getAnoFabrico());
        }
        
        System.out.println("\n\n\n");
        
        for(Carros c: EnumSet.range(Carros.MC, Carros.MS)){
            System.out.printf("%-15s%-10s%-15s\n", c, c.getTitle(), c.getAnoFabrico());
        }
    }
}
