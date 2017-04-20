package gradeBook4;

/**
 *
 * @author Carlos-Pina
 */
public class Aluno {
    private int codigo;
    private String nome;
    
    public Aluno( int codigo, String nome ){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return codigo + " - " + nome;
    }
}
