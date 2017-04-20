package SobrecargaMetodos;

/**
 *
 * @author Carlos-Pina
 */
public class MethodOverload {
    //teste de metodos square sobrecarregados
    public void testOverloadedMethods(){
        System.out.printf("Square of integer 7 is %d\n", square(7));
        System.out.printf("Square of double 7.5 is %f\n", square(7.5));
    }
    
    //metodo square com argumento int
    public int square( int intvalue){
        System.out.printf("\nCalled square with int arguments: %d\n", intvalue);
        return intvalue * intvalue;
    }
    
    
    //metodo squere com argumento double
    public double square( double doublevalue){
        System.out.printf("\nCalled square with double arguments: %f\n", doublevalue);
        return doublevalue * doublevalue;
    }
}
