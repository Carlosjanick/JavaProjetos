package craps;

import java.util.Random;

/**
 *
 * @author Carlos-Pina
 */
public class Craps {
    // cria gerador de números aleatorios para o uso no método rollDice.
    private static final Random randomNumbers = new Random();
    
    // enumração com constantes que representan o status do jogo.
    private enum Status{CONTINUE, WON, LOST};
    
    // constantes que representam lançamentos comuns dos dados.
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    // joga uma partida de craps
    public void play(){
        int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem.
        Status gameStatus; // pode conter CONTINUE, WON ou LOST.

        int sumOfDice = rollDice();
        
        // determina o status do jogo e a pontuação com base no primeiro lançamento. 
        switch(sumOfDice){
            case SEVEN://ganha com 7 no primeiro lançamento
            case YO_LEVEN: //ganha com 11 no primeiro lançamento
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //perde com 2 no primeiro lançemento
            case TREY: //perde com 3 no primeiro lançemento
            case BOX_CARS: // perde com 12 no primeiro lançemento
                gameStatus = Status.LOST;
                break;
            default: //não ganhou nem perdeu, entao registra a pontuação
                gameStatus = Status.CONTINUE; //jogo nao terminou
                myPoint = sumOfDice; //informa a pontuação
                System.out.printf("Point is %d\n", myPoint);
                break;
        }
        
        //enquanto o jogo não estiver completo
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice(); //lança os dados novamente
            
            //determina o status do jogo
            if(sumOfDice == myPoint){ //vitoria por pontuação
                gameStatus = Status.WON;
            }else if(sumOfDice == SEVEN){ //perde obtendo 7 antes de atingir a pontuação
                gameStatus = Status.LOST;
            }
            
            //exibe a mensagem que ganhou ou perdeu
            if(gameStatus == Status.WON){
                System.out.println("Player wins");
            }else{
                System.out.println("Player loses");
            }
            
        }
        
    }
    
    
    
    
    // lança os dados. calcula a soma e  exibe os resultados 
    public int rollDice(){
        //seleciona valores aleatorios.
        int die1 = 1 + randomNumbers.nextInt(6); //primeiro lançamento de dados.
        int die2 = 1 + randomNumbers.nextInt(6); //segundo lançamento de dado.
        
        int sum = die1 + die2; //soma dos valores dos dados
        
        //exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
        
        return sum;
    }
    
    
}
