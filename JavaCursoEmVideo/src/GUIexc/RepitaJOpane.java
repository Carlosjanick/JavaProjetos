package GUIexc;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos.J.Pina
 */
public class RepitaJOpane {

    public static void main(String[] args) {
        int n, s = 0;
        int contador = 0, p = 0, i = 0, ac = 0;
        
        do {
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero<br> <em>(0 interronpe)</em></html>"));
            
            if (n != 0){
                contador += 1;
                s += n;
            }
            
            if(n%2 == 0){
                if( n != 0){
                   p += 1; 
                }
                
            }else{
                   i += 1;
            }
            
            if(n > 100){
                ac += 1;
            }
        } while (n != 0);
        
        double m = s/contador;
        JOptionPane.showMessageDialog(null, "<html>Total de numeros : <hr> "+contador+" <br> Total calculo: <hr>" + s + "<br> Total de Par: <hr> "+p+" "
                + "<br> Total de Impar: <hr> "+i+" <br> Acima de 100: <hr> "+ac+"<br> Media: <hr> "+m+"</html>",
                "Titulo", JOptionPane.WARNING_MESSAGE);
    }

}
