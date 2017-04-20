package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;


/**
 *
 * @author Carlos.J.Pina
 */
public class ResolucaoDeTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();

        System.out.println("Sua tela tem resolução " + lar + " x " + alt);
    }
}
