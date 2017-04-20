package Medodos02;

/**
 *
 * @author Carlos.J.Pina
 */
public class metodos {
    
    public static String contador(int i, int f){
        String s = "";
        
        for(int c = i; c < f; c++){
            s += c+" ";
        }
        
        return s;
    }
}
