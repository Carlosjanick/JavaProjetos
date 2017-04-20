package cv.edu.us.time;

/**
 *
 * @author Carlos-Pina
 */
public class MemberAccessTest {
    public static void main(String[] args) {
        Time1 time = new Time1();
        
       // time.hour = 7;// erro: hour tem acesso privado em time1
        //time.minute = 15; // erro: minute tem acesso privado em time1
       // time.second = 30; // erro: second tem acesso privado em time1
        
    }
}
