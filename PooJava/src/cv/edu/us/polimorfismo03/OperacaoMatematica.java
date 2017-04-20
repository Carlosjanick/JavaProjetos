package cv.edu.us.polimorfismo03;

//polimorfirsmo: varias formas. mesmos metodos com comportamentos diferentes
//classe abstract nao pode ser instanciada por objetos somente pode ser herdada
//metodos abstratos nao tem corpo . são metodos que por obrigação devem ser implementadas nas subclasses da superclasse
//classe abstrat pode ter também metodos implementados.
public abstract class OperacaoMatematica {
    
    //metodo padrão
    public abstract double calcular(double x, double y); //implementado nas classes filhas de varias formas.
}
