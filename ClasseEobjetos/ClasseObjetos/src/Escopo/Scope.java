package Escopo;

/**
 *
 * @author Carlos-Pina
 */
public class Scope {
    // campo acesivel para todos os metodos dessa classe
    private int x = 1;
    
    //metodo begin cria e inicializa a variavel local x
    // e chama os metodos useLocalVariable e useField
    public void begin(){
        int x = 5; // variavel local x do metodo sobreia o campo x.
        
        System.out.printf("local x in methodo begi is %d\n", x);
        
        useLocalVariable(); //useLocalVariable tem uma variavel local x
        useField(); // useField utiliza o campo x da classe Scope
        
        useLocalVariable(); //useLocalVariable reinicializa a variavel local x
        useField(); // campo x da classe Scope retém seu valor
        
        
    }
    
    
    //cria e inicializa a variavel local x durante cada chamada
    public void useLocalVariable(){
        int x = 25; //inicializa toda vez que useLocalVariable é chamado
        
        System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x);
        ++x; //modifica a variavel local x desse metodo
        
        System.out.printf("local x before exiting method useLocalVariable is %d\n", x);
    }
    
    
    //modifica o campo x da classe Scope durante cada chamada
    public void useField(){
        System.out.printf("\nfield x on entering method useField is %d\n", x);
        x *= 10; // modifica o campo x da classe Scope
        System.out.printf("field x before exiting method useField is %d\n", x);
    }
}
