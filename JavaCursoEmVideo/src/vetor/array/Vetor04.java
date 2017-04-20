package vetor.array;

import java.util.Arrays;

/**
 *
 * @author Carlos.J.Pina
 */
public class Vetor04 {
    public static void main(String[] args) {
        int num[] = {3,5,1,8,4};
        int posicao = Arrays.binarySearch(num, 1);//verifica onde a posiçao do numero 1 no vetor
     
        System.out.println(posicao);
        
        int nun[] = new int[5];
        //preenchimento automatico
        Arrays.fill(nun, 8); //preencher todas as posiçoes com 8
        
        for(int i = 0; i < nun.length; i++){
            System.out.println(nun[i]);
        }
    }
}
