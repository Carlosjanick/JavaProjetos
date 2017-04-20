package gradeBook1;

/**
 *
 * @author Carlos-Pina
 */
public class GradeBook {
    private String couseName; //nome do curso que essa gradeBook representa.
    private int[] grades; // array de notas de aluno
    
    //construtor de dois argumentos inicializa courseName e o array de notas
    public GradeBook(String couseName, int[] gradesArray) {
        this.couseName = couseName; //inicializa courseName
        this.grades = gradesArray; // niveis de armanzenamento.
    }

    //metodo para configurar o nome do curso
    public void setCouseName(String couseName) {
        this.couseName = couseName;
    }
    
    //metodo para recuperar o nome do curso
    public String getCouseName() {
        return couseName;
    }
    
    //exibe uma mensagem de boas-vindas para o utilizador GradeBook
    public void displayMessage(){
        //getCouseName obtém o nome do curso
        System.out.printf("Welcome to the grade book for \n%s!\n\n", getCouseName());
    }
    
    //realiza varias operaçoes nos dados
    public void processGrades(){
        //gera a saida de array notas
        outputGrades();
        
        //chama metodo getAverage para calcular a nota media
        System.out.printf("\nClass average is %.2f\n", getAverage());
        
        //chama metodos getMinimun e getMaximun
        System.out.printf("Lowest grade is %d\n Highest grade is %d\n\n", getMinimun(), getMaximun());
        
        //chama outputBarchart para imprimir grafico de distribuiçao de notas
        outputBarChart();
    }
    
    //localiza a nota minima
    public int getMinimun(){
        int lowGrade = grades[0]; //assume que grades[0] é a menor nota
        
        //faz um loop pelo array de notas
        for(int grade: grades){
            //se nota for mais baixa que lowGrade, essa note é atribuida a lowGrade
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }
        
        return lowGrade;
    }
    
    //locaiza a nota maxima
    public int getMaximun(){
        int highGrade = grades[0]; //assumi que grades[0] é a maior nota
        //faz o loop pelo array de notas
        for(int grade: grades){
            //se a nota for maior que highGrade. atribui essa nota a highGrade
            if(grade > highGrade){
                highGrade = grade; //nota mais alta
            }
        }
        
        return highGrade;
    }
    
    //determina a media para o teste
    public double getAverage(){
        int total = 0; //inicializa o total
        
        //soma notas de um aluno
        for(int grade: grades){
            total += grade;
        }
        
        return (double) total/grades.length;
    }
    
    //gera a saida do grafico de barras exibindo distribuição de notas
    public void outputBarChart(){
        System.out.println("Grade distribution:");
        
        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[ 11 ];
        
        //para cada nota incrementa a frequencia apropiada
        for( int grade: grades){
            ++frequency[grade / 10];
        }
        
        //para cada frequencia de nota, imprime barra no grafico
        for (int count = 0; count < frequency.length; count++) {
            //imprimi rotulo de barra ("00-09") ("90-99"), ("100")
            if(count == 10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%02d-%02d",count * 10, count * 10 + 9);
            }
            
            // imprime a barra de asteristicos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    //gera a saida do conteudo do array de notas
    public void outputGrades(){
        System.out.println("The grades are: \n");
        
        //gera a saida da nota de cada aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d\n", student + 1, grades[ student ]);
        }
    }
    
}




