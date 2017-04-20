package Array;

/**
 *
 * @author Carlos-Pina
 */
public class BarChart {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1}; //arra com quantidades de notas cada posiçao é referente a um entervalo ex: 0 -> (00-09)
        
        System.out.println("Grade distribuition:");
        
        //para cada elemento de array, gera saida de uma barra do grafico
        
        for (int counter = 0; counter < array.length; counter++) {
            //00-09 10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-99 100 (intervalos das notas) 
            //imprime rotulo de barra ("00-09: " , - , "90-99: ", "100:")
           
            
            if(counter == 10){
                System.out.printf("%5d", 100);
            }else{
                System.out.printf("%02d-%02d", counter * 10, counter * 10 +9);
            }
            
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }
            
            
            System.out.println(); //gera saida de uma nova linha.
        }
    }
}


