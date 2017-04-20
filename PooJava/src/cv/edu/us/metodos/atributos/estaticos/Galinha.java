package cv.edu.us.metodos.atributos.estaticos;

/**
 *
 * @author Carlos-Pina
 */
public class Galinha {
   
    public int ovos; //representa o total de ovos do objeto galinha
    public static int ovosDaCapeiraTotal; //variavel global.. da classe
    public static int totalGalinha; //guarda o total de galinhas.
    
    public Galinha(){
        Galinha.totalGalinha++;
    }
    
    //para poder chamar assim g1.botarOvo().botarOvo().botarOvo();
    /*public Galinha botarOvo(){
        this.ovos++;
        
        Galinha.ovosDaCapeiraTotal++; //totaliza o total de ovos colocados por todas as galinhas
        
        return this;
    }*/
    public void botarOvo() {
        this.ovos++;

        Galinha.ovosDaCapeiraTotal++; //totaliza o total de ovos colocados por todas as galinhas

    }

    //metodo estatico
    public static double mediaDeOvos() {
       return Galinha.ovosDaCapeiraTotal / Galinha.totalGalinha;
    }
}
