package Array;

/**
 *
 * @author Carlos-Pina
 */
public class ForAprimorada {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        int total = 0;
        for(int nota: array){
            total += nota;
        }
        
        System.out.printf("Total de notas é %d\n", total);
    }
}
