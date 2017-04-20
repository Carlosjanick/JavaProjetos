package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos.J.Pina
 */
public class SomaComJOpane {
    public static void main(String[] args) {
        int nun1;
        int nun2;
        int soma;
        
        nun1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º numero ?"));
        
        nun2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º numero ? "));
        
        //soma = nun1 + nun2;
        soma = Integer.sum(nun1, nun2);
        
        JOptionPane.showMessageDialog(null, "O resultado da soma é "+soma);
    }
}
