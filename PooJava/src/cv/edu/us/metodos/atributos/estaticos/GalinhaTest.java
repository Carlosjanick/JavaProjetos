package cv.edu.us.metodos.atributos.estaticos;

/**
 *
 * @author Carlos-Pina
 */
public class GalinhaTest {
    public static void main(String[] args) {
        Galinha g1 = new Galinha();
        
        //g1.botarOvo().botarOvo().botarOvo();
        
        g1.botarOvo();
        g1.botarOvo();
        g1.botarOvo();
        
        Galinha g2 = new Galinha();
        g2.botarOvo();
        g2.botarOvo();
        
        Galinha g3 = new Galinha();
        g3.botarOvo();
        g3.botarOvo();
        
        Galinha g4 = new Galinha();
        g4.botarOvo();
        g4.botarOvo();
        g4.botarOvo();
        g4.botarOvo();
        g4.botarOvo();
        g4.botarOvo();
        
        System.out.println("Total de ovos do objeto 1: "+ g1.ovos);
        
        System.out.println("Total de ovos do objeto 2: "+ g2.ovos);
        
        System.out.println("Total de ovos do objeto 3: "+ g3.ovos);
        
        System.out.println("Total de ovos do objeto 4: "+ g4.ovos);
        
        System.out.println("Total de Galinhas: "+ Galinha.totalGalinha);
        
        System.out.println("Total de ovos da Capeira: "+ Galinha.ovosDaCapeiraTotal);
    
        System.out.println("Media de ovos: "+ Galinha.mediaDeOvos());
    }
}
