package cv.edu.us.time;

/**
 *
 * @author Carlos-Pina
 */
public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

//classe SimpleTime demostra a referencia "this"
class SimpleTime{
    private int hour; 
    private int minute;
    private int second;
    
    
    //se o construtor utilizar nomes de parametro identicos a
    //nomes de variaveis de instancia a referencia this 
    //exigida para distinguir entre nomes.
    public SimpleTime(int hour, int minute, int second ){
        this.hour = hour; //configura a hora do objeto this
        this.minute = minute; // configura os minutos do objeto this
        this.second = second; // configura os segundos do objeto this
    }
    
    //usa this explicito e  implicito para chamar toUniversalString
    public String buildString(){
        return String.format("%24s: %s\n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
    }
    
    public String toUniversalString(){
        //this nao é requerido aqui para acessar variaveis de instancia
        //porque o metodo nao tem variaveis locais com os mesmos 
        //nomes das variaveis de instancia
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    
    
}
