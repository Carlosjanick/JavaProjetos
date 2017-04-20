package cv.edu.us.enum01;

/**
 *
 * @author Carlos-Pina
 */
public class EnunTest {
    public static final double PI = 3.14; //constante normal
    
    public static void andar(Medida medida, int total){
        if(medida == Medida.M){
            //..codigo
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(PecasXadrez.BISPO);
        
        System.out.println(Medida.MM.titulo);
        
        
        //percorer as enum
        for(Medida m: Medida.values()){
            System.out.println(m + " : "+m.titulo);
        }
        
        
        andar(Medida.M, 100);
    }
}
