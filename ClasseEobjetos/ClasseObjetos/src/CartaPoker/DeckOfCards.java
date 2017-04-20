package CartaPoker;

import java.util.Random;

/**
 *
 * @author Carlos-Pina
 */
public class DeckOfCards {
    private Card[] deck; //array de objetos Card
    private int currentCard; // indice do proximo Card a ser distribuido
    private static final int NUMBER_OF_CARDS = 52; //numero constante de cards
    
    //gerador de numero aleatorio
    private static final Random randomNumbers = new Random();
    
    //construtor preenche baralho de cartas
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[ NUMBER_OF_CARDS ]; //cria array de objetos Card
        currentCard = 0; // configura currentCard então o primeiro Card distribuido é deck[0].
        
        //preenche baralho com objetos Card [count % 13] sempre retorna numero de 0 a 12 e [count / 13]sempre retorn numero de 0 a 3
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }
    
    
    //embaralha as cartas com um algoritimo de uma passagem
    public void shuffle(){
        //depois de embaralhar, a distribuiçao deve iniciar em deck[0] novamente
        currentCard = 0; //reinicializa currentCard
        
        //para cada Card, seleciona outro Card aleatorio e os compara
        for(int first = 0; first < deck.length; first++) {
            //seleciona um numero aleatorio entre 0 e 51
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
            
            //baralha trocando ....
            //compara Card atual com Card aleatoriamente selecionado
            Card temp = deck[ first]; //coloca na variavel tempe a carta na posiçao first para poder dpois trocar
            deck[first] = deck [ second ];
            deck[ second ] = temp;
        }
    }
    
    
    //distribui um Card
    public Card dealCard(){
        //determina se ainda ha cards a serem distribuidos
        if(currentCard < deck.length){
            return deck[ currentCard++ ]; // retorna e depos incrementa a variavel currentCard 
        }else{
            return null; // retorna nulo para indicar que todos os Cards foram distribuidos 
        }
    }
    
}
