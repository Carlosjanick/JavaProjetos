package cv.edu.us.staticc;

//variavel estatica utilizada para manter uma contagem do numero
//de objetos Employee na memória.
public class Employee {
    private String firstName;
    private String lastName;
    private static int count = 0; //o numero de Employees criados
    
    //inicializa Employee, adiciona 1 a static count e 
    //gera a saida de String indicando que o construtor foi chamado
    public Employee( String first, String last ){
        firstName = first;
        lastName = last;
        
        ++count; //incrementa contagem esttica de empregados
        System.out.printf("Employee construtor: %s %s; count = %d\n"
        ,firstName, lastName, count);
    }
    
    //obtem o primeiro nome
    public String getFirstName(){
        return firstName;
    }
    
    //obtem o ultimo nome
    public String getLastName(){
        return lastName;
    }
    
    //metodo estatico para obter valor de contagem estatica
    public static int getCount(){
        return count;
    }
}
