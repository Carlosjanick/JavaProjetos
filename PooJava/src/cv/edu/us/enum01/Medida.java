package cv.edu.us.enum01;

/**
 *
 * @author Carlos-Pina
 */
public enum Medida {
    MM("Milimetro"), CM("Centimetro"), M("Metro");
    
    //titulo
    public String titulo;
    //construtor para pegar titulo das enumeraçoes
    Medida(String titulo){
        this.titulo = titulo;
    }
}
