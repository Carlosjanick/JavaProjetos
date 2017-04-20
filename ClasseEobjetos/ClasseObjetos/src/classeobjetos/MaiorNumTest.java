package classeobjetos;

import java.util.Scanner;

/**
 *
 * @author Carlos-Pina
 */
public class MaiorNumTest {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe os treis numeros separados por espaço!");
        double nun1 = ler.nextDouble();
        double nun2 = ler.nextDouble();
        double nun3 = ler.nextDouble();
        
        MaiorNum mn = new MaiorNum();
        System.out.println("Maior valor entre "+nun1+", "+nun2+", "+nun3+ " é "+mn.maxiValor(nun1, nun2, nun3));
        
    }
}
