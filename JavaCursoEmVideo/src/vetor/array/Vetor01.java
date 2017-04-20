package vetor.array;

/**
 *
 * @author Carlos.J.Pina
 */
public class Vetor01 {
    public static void main(String[] args) {
        // int n[] = {2,5,6,8,9};
        
        //int n[] = new int[4];
        int n[] = {2,6,8,9,4,7};
        
        System.out.println("Tamanho: "+ n.length);
        
        System.out.println("");
        
        for(int c=0; c < n.length; c++){
            System.out.print(n[c] + " ");
        }
    }
}
