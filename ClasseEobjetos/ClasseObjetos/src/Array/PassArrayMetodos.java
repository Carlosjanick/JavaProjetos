package Array;

/**
 *
 * @author Carlos-Pina
 */
public class PassArrayMetodos {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(
                "Effects of passing reference to entire array: \n"
                + "The values of the original array are:\n");

        //gera saida dos elementos da array original
        for (int value : array) {
            System.out.printf("  %d", value);
        }

        modifyArray(array); // passa a referencia do array para o metodo
        
        System.out.println("\n\nThe values of the modified array are:");
        //gera saida dos elementos do array modificado
        for(int value1: array){
            System.out.printf("  %d",value1);
        }
        
        
        System.out.printf(
                "\n\nEffects of passing array element value:\n"+
                "array[3] before modifyElement: %d\n", array[3]);
        
        modifyElement( array[3] ); //tenta modificar o array[3]
        
        System.out.printf("array[3] after modifyElement: %d\n", array[3]);
        
        
        System.out.println();
    }

    //multiplica cada elemento de um array por 2
    public static void modifyArray( int[] array2 ) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    //multiplica argumento por 2
    public static void modifyElement( int element ){
        element *= 2;
        
        System.out.printf("Value of element in modifyElement: %d\n", element);
    }
}
