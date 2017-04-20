package cv.edu.us.polimorfismo.interfaces;

//superclasse abstrata Employee
public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    //construtor com tres argumentos
    public Employee( String first, String last, String ssn ){
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }//fim do construtor Employee com tres argumentos
    
    //configura o nome
    public void setFirstName( String first ){
        this.firstName = first;
    }
    
    //retorna o nome 
    public String getFirstName(){
        return this.firstName;
    }
    
    //configura o sobrenome
    public void setLastName( String last ){
        this.lastName = last;
    }
    
    //retorna o sobrenome
    public String getLastName(){
        return this.lastName;
    }
    
    //configura ssn
    public void setSocialSecurityNumber( String ssn ){
        this.socialSecurityNumber = ssn;
    }
    
    //retorna ssn
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    //retorna a representação String do objeto
    @Override
    public String toString(){
        return String.format("%s %s\nSocial Security Number :%s", this.firstName, this.lastName, this.socialSecurityNumber);
    }//fim do metodo toString.
    
}//fim da classe abstrata Employee
