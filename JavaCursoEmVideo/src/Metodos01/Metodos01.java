package Metodos01;

/**
 *
 * @author Carlos.J.Pina
 */
public class Metodos01 {
    //procedimento não retorna nada.
    /*static void soma(int n1, int n2){
        int s = n1 + n2;
        System.out.println("Resultado da soma: "+s);
    }*/
    
    //metodo retorna algo 
    static int soma(int n1, int n2){
        int s = n1 + n2;
        return s;
    }
    
    public static void main(String[] args) {
       int sm = soma(8, 2);
        System.out.println("O resultado da soma é "+sm);
    }
}
