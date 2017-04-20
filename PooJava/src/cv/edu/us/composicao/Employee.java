package cv.edu.us.composicao;

/**
 *
 * @author Carlos-Pina
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate; //do tipo objeto
    private Date hireDate; //do tipo objeto
    
    //construtor para inicializar nome, data de nascimento e 
    //data de contratação
    public Employee( String first, String last, Date dateOfBirth, Date dateOfHire ){
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }
    
    /*
    public Date getBirthDate(){
        return this.birthDate;
    }
   **/
    
    //converte Employee em formato String
    public String toString(){
        return String.format("%s , %s Hired: %s Birthday: %s", lastName,
        firstName, hireDate, birthDate );
    }
}
