package OperadoresUnarios;

/**
 *
 * @author Carlos.J.Pina
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        //pósIncremento -> incrementa depois 
        //nun++
        int nun1 = 8;
        System.out.println(nun1++); //imprimi 8 depois incrementa numa proxima execuçao valendo 9
        int result = 8 + nun1++;
        //depois do calculo vai passa a valer +1
        //System.out.println(result);
        //System.out.println(nun1);
        
        
        
        //pósDecremento -> Decrementa depois
        //nun--
        int nun2 = 8;
        //nun2--;
        
        int res = 2 + nun2--;
        
        //System.out.println(res);
        //System.out.println(nun2);
        
        
        
         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //préIncremento -> incrementa antes 
        //++nun
        int n = 7;
        //++n
        
        int rest = 1 + ++n;
        //System.out.println(rest);
        
        //préDecremento ->  decrementa antes
        //--nun
        
        int n4 = 8;
        // --n4;
        
        int r = 4 + --n4;
        //System.out.println(r);
        
        
        //quando queremos mais do que um incremento
        //ex: x += 5; ->  x = x + 5;
        //x-=5; -> x = x - 5;
        //x*=5; -> x = x * 5;
        //x/=5; -> x = x / 5;
        //x%=5; -> x = x%5;
        
        int x1 = 7;
        // x1 += 3;
        //x1 -= 3;
        //x1 *= 3;
        //x1 /= 3;
         x1 %= 3;
         
        System.out.println(x1);
     
    }
}
