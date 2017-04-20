package gradeBook3;

/**
 *
 * @author Carlos-Pina
 */
public class GradeBook {
    private String nomeCurso;
    private int[][] notas;
    
    //construtor 
    public GradeBook( String nomeCurso, int[][] gradeArray ){
        this.nomeCurso = nomeCurso;
        this.notas = gradeArray;
    }
    
    public void setNomeCurso( String nomeCurso ){
        this.nomeCurso = nomeCurso;
    }
    
    public String getNomeCurso(){
        return nomeCurso;
    }
    
    public void displayMessage(){
        System.out.printf("Seja Benvindo ao Livro de notas para o Curso de %s\n", getNomeCurso());
    }
    
    //executa varias operaçoes
    public void exOperacoes(){
        //gera a saida de array de notas
        outputNotas();
        //chama metodos getMinimun e getMaximum
        System.out.printf("A nota minima da turma é %2d e a nota maxima é %d\n", getNotaMinima(), getNotaMaxima());
	//gera saida de grafico de distribuiçao dde notas de todas as notas em todos os testes
        outputGrafico();
    }
    
    //nota minima
    private int getNotaMinima(){
        int minNota = notas[0][0];
        //faz loop pelas linhas
        for (int[] arrayL: notas) {
            //faz loop pelas colunas
            for(int nota: arrayL){
                if(nota < minNota){
                    minNota = nota;
                }
            }
        }
        
        return minNota;
    }
    
    //nota maxima
    private int getNotaMaxima(){
        int maxNota = notas[0][0];
        for (int linha = 0; linha < notas.length; linha++) {
            for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                if(notas[linha][coluna] > maxNota){
                    maxNota = notas[linha][coluna];
                }
            }
        }
        
        return maxNota;
    }
    
    //determina a media do conjunto de particular de motas
    private double getMediaAluno(int[] arrayAluno){
        int total = 0;
        for(int nota: arrayAluno){
            total += nota;
        }
        
        return (double) total / arrayAluno.length;  
    }
    
    //gera a saida do grafico de barras para exibir distribuiçao de notas
    private void outputGrafico(){
        int[] frequency = new int[11]; //para pode facilitar 100/10 da 10 e nao encontra a posicao frequency[10]
        
        for (int[] arrayL: notas) {
            for(int nota: arrayL){
                ++frequency[nota / 10];
            }
        }
        
        for (int count = 0; count < frequency.length; count++) {
            if(count == 10){
                System.out.printf("%5d", 100);
            }else{
                System.out.printf("%02d-%02d", count * 10, count * 10 + 9);
            }
            
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            
            System.out.println();//gera saida de uma linha
        }
    }
    
    //gera a saida do conteudo do array de notas --SAIDA TOTAL
    private void outputNotas(){
        System.out.println("As notas são:\n");
        System.out.println("----------------------------------------------");
        System.out.print("            "); //ajustar as colunas
        for (int cout = 0; cout < notas[0].length; cout++) {
            System.out.printf("Teste %d ", cout + 1);
        }
        System.out.println("Media");
        System.out.println("----------------------------------------------");
        
        for (int student = 0; student < notas.length; student++) {
            System.out.printf("student %2d", student + 1);
            
            for (int nota = 0; nota < notas[student].length; nota++) {
                System.out.printf("%7d", notas[student][nota]);
            }
            
            double media = getMediaAluno(notas[student]);
            System.out.printf("%10.2f", media);
            
            System.out.println("\n----------------------------------------------");
        }
       
    }
    
}
