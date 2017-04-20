package cv.edu.us.polimorfismo.interfaces;

//testa a interface Pyable
public class PayableInterfaceTest {
    public static void main(String[] args) {
        //cria array Payable 
        Payable[] payableObjects = new Payable[ 5 ];
        
        //preenche o array com objetos que implementam Payable
        payableObjects[ 0 ] = new Invoice("01234", "seat", 2, 375);
        payableObjects[ 1 ] = new Invoice("7800", "tire", 4, 79.95);
        
        payableObjects[ 2 ] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        
        payableObjects[ 3 ] = new CommissionEmployee("Carlos", "Pina", "222-22-2222", 6, 12.9);
        payableObjects[ 4 ] = new BasePlusCommissionEmployee("Jorge","Centeio", "333-33-3333", 5, 50, 900);
        
        
        System.out.println("Invoices and Employees procesed polymorphically:\n");
        
        //processa genericamente cada elemento ao array payableObjets
        for(Payable currentPayable : payableObjects){
            //gera a saida de currentPayable e o pagamento apropiado
            System.out.printf("%s \n%s: $%.2f\n\n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
        
    }
}
