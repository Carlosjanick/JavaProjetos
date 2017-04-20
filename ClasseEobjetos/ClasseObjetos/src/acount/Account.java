package acount;

/**
 *
 * @author Carlos.J.Pina
 */
public class Account {
    private double balance; //variavel de estancia que armanzena o saldo.
    
    //construtor

    public Account(double balance) {
        //valida que initialBalance é maior que 0.0
        //se nao, o saldo é inicializado com o valor padrão
        if (balance > 0.0){
           this.balance = balance;
        }
    } // fim do construtor Account
    
    
    ///////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////
    public void credit( double  amount ){
        this.balance = this.balance + amount;  //adiciona a quantia ao atual.
    }// fim do metodo credit
    
    public double getBalance(){
        return balance;
    }
}
