package CartaPoker;

/**
 *
 * @author Carlos-Pina
 */
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // coloca as cartas em ordem aleatoria //baralha
     
        //imprimi todas as 52 cartas na ordem em que são distribuidas
        for (int i = 1; i <= 52; i++) {
            //distribui e exibe uma card
            System.out.printf("%-20s", myDeckOfCards.dealCard());
            
            if(i % 4 == 0){//imprime uma nova linha a cada 4 cartas
                System.out.println();
            }
        }
        
    }
}
