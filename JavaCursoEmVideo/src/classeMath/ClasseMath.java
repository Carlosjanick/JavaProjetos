/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeMath;

/**
 *
 * @author Carlos.J.Pina
 */
public class ClasseMath {
    public static void main(String[] args) {
        
        //usando a classe Math (Matématica)
        //abs  valor absoluto (-8) = 8.
        int va = -9;
        int vva = Math.abs(va);
        /////////////////////////////////////////////
        
        //arredonda para baixo
        float arb = 8.2f;
        int arrb = (int) Math.floor(arb);
        ////////////////////////////////////////////
        
        //aredonda para cima
        float arc = 8.2f;
        int arcc = (int) Math.ceil(arc);
        //////////////////////////////////////////
        
        //Raiz quadrada
        float rq = (float) Math.sqrt(25);
        
        //Raiz cubica
        float rc = (float) Math.cbrt(3);
        
        //arendondamento aritmetico
        int aar = (int) Math.round(8.5); //9
        int aarr = (int) Math.round(8.4); //8
        
        
        //potencia
        int pot = (int) Math.pow(5, 2);
        
        //PI
        float Pi = (float) Math.PI;
        
        
        //EXTRAÇÃO ALEATORIA.
        float rand = (float) Math.random();
        
        //fazendo com que a extraçao seja de 1 a 9 por exemplo: 
        int nun = (int) (1 + rand  *(9-1));
                
               
        //System.out.println(nun);
        
    }
}
