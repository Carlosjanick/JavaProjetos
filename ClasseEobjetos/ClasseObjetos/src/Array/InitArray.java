package Array;

/**
 *
 * @author Carlos-Pina
 */
//Inicializando os elementos de um array com valores padrao de zero.
public class InitArray {
    public static void main( String[] args){
        
        //1º EX:
        /*
            int[] array; //declara o array identificado.

            array = new int[10]; // cria o objeto array

            System.out.printf("%s%8s\n", "Index", "value"); // titulos de coluna

            //gera saida do valor de cada elemento do array
            for( int counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%8d\n", counter, array[counter]);
            }
        */
        
        //2º EX:
        /*
            int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

            System.out.printf("%s%10s\n", "Index", "Value"); //titulos de colunas

            for(int counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%8d\n", counter, array[counter]);
            }
        */
        
        //3º EX:
        final int ARRAY_LENGTH = 10; //declara constante.
        int[] array = new int[ ARRAY_LENGTH ]; //Cria o array
        
        //Povoa array com dados.
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + (2 * counter);
        }
        
        System.out.printf("%s%8s\n", "Index", "Value"); // titulos das colunas
        
        //gera a saida do valor de cada elemento do array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
