package cv.edu.us.polimorfismo02;


public class OperacaoTeste {
    
    //recebe o objeto e realiza o calculo. chamando o metodo apropiado
    public static void operacao( OperacaoMatematica o, double x, double y ){
        System.out.println(o.calcular(x, y));
    }
    
    
    public static void main(String[] args) {
        operacao( new Soma(), 5, 5 );
        
        operacao( new Multiplicacao(), 5, 5 );
    }
}
