package idiomasistemaoperacional;

import java.util.Locale;

/**
 *
 * @author Carlos.J.Pina
 */
public class IdiomaDoSistema {
   
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();

        System.out.print("O seu sistema operacional está em ");
        System.out.println(loc.getDisplayLanguage() + '\n');   //retorna o idioma do sistema operacional ex: portugues.
        System.out.println(loc.getLanguage());                 //retorna o idioma abreviado pt.
        
    }
}
