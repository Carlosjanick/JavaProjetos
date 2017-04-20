package cv.edu.us.polimorfismo;

/**
 *
 * @author Carlos-Pina
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        //atribui uma referencia de superclasse a variavel de superclasse
        CommissionEmployee ce
                = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        //atribui uma referencia de subclasse a variavel da subclasse
        BasePlusComissionEmployee bpce
                = new BasePlusComissionEmployee("Bob", "Lewis", "333-33-3333", 5000, -04, 300);

        //invoca toString no objeto de superclasse utilizandoa variavel de superClase
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call CommissionEmployee´stoString with superclass reference",
                "to superclass object",
                ce.toString());

        //invoca toString no objeto de subclasse utilizando avariavel de subclasse
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusComissionEmployee toString with subClass",
                "reference to subclass object",
                bpce.toString());

        //invoca toString no objeto de subclasse utilizando a variavel de superclasse
        CommissionEmployee ce2 = bpce;
        
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusComissionEmployee toString with superClasse",
                "reference to subclass object",
                ce2.toString());
        
    }
}
