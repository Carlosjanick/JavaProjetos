package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos.J.Pina
 */
public class CaixaDialogoJOpane {
    public static void main(String[] args) {
        //PEDE PARA O UTILIZADOR INFORMAR SEU NOME
        String nome = JOptionPane.showInputDialog("Qual é o seu nome ?");

        //cria a mensagem
        //String.format -> Funciona como printf em vez de exibir retorna a string formatada.
        String mensagem = String.format("Welcome, %s, to java programing", nome);
        
        //exibe a mensagem
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
}
