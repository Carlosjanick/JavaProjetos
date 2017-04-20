package ClasseArrays;

import java.util.Arrays;

/**
 *
 * @author Carlos-Pina
 */
public class ArrayManipulations {
    public static void main(String[] args) {
        //classifica doubleArray em ordem crescente
        double[] doubleArray = { 8.4, 9.3,0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray); //ordena crescente
        System.out.printf("\ndoubleArray: ");
        
        for(double valor: doubleArray){
            System.out.printf("%.1f ", valor);
        }
        
        //preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7); //inicializa o array com 7 em todas as posiçoes
        
        displayArray(filledIntArray, "filledIntArray");
        
        //copia array intArray em array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
        
        //COMPARA A IGUALDADE DE IntArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));
        
        //compara a igualdade de intArray e filledIntArray
        boolean c = Arrays.equals(intArray, filledIntArray);
        System.out.printf("\n\nnintArray %s filledIntArray\n", (c ? "==" : "!="));
        
        
        //pesquisa em intArray o valor 5
        int location = Arrays.binarySearch(intArray, 5);
        
        if ( location >= 0){
            System.out.printf("Found 5 at element %d in intArray\n", location);
        }else{
            System.out.printf("5 not found in intArray\n");
        }
        
        //pesquisa em intArray o valor 8763
        int loc = Arrays.binarySearch(intArray, 8763);
        if( loc >= 0){
            System.out.printf("Found 8763 at element %d in intArray\n", loc);
        }else{
            System.out.printf("8763 not found in intArray\n");
        }
    }
    
    
    public static void displayArray( int[] array, String description ){
        System.out.printf("\n%s: ", description );
        for( int valor: array ){
            System.out.printf("%d ", valor);
        }
        System.out.println();
    }
    
}
