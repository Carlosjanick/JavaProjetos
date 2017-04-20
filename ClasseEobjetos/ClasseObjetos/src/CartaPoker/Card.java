package CartaPoker;

/**
 *
 * @author Carlos-Pina
 */
public class Card {
    private String face; // face da carta ("Ace", "Deuce", -)
    private String suit; // naipe da carta ("Hearts", "Diamonds", -)

    public Card(String face, String suit) {
        this.face = face; //inicializa face da carta 
        this.suit = suit; //inicializa naipe da carta 
    }

    //retorna representaçao String da carta
    @Override
    public String toString() {
        return face + " of " + suit;
    }
    
}
