package horadosistema;

import java.util.Date;

/**
 *
 * @author Carlos.J.Pina
 */
public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());
    }
}
