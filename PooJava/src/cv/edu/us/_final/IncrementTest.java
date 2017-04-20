package cv.edu.us._final;
//VARIAVEL FINAL INICIALIZADA COM UM ARGUMENTO DE CONSTRUTOR.
public class IncrementTest {
    public static void main(String[] args) {
        Increment value = new Increment( 5 );
        
        //antes
        System.out.printf("Before incrementing: %s\n\n", value );
        
        //depois
        for( int i = 1; i <= 3; i++ ){
            value.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i, value);
        }
        
        
    }
}
