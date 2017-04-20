package Array;

/**
 *
 * @author Carlos-Pina
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int[][] array2 = { { 1, 2, 3 }, { 4 }, { 5, 6, 7, 8 } };
        
        System.out.println("Valor do array 1:");
        outputArray(array1);
        
        System.out.println("Valores do array 2:");
        outputArray(array2);
    }
    
    public static void outputArray( int[][] array ){
        
        //faz loop pelas linhas
        for (int linha = 0; linha < array.length; linha++) {
            
            //faz loop pelas colunas de cada linha
            for (int coluna = 0; coluna < array[linha].length; coluna++) {
                System.out.printf("%d", array[linha][coluna]);
            }
            
            System.out.println();
        }
    }
}
