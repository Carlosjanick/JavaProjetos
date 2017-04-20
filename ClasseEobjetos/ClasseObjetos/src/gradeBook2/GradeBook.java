package gradeBook2;

/**
 *
 * @author Carlos-Pina
 */
public class GradeBook {
    private String courseName; //nome do curso que este livro de nota apresenta
    private int[][] grades; //array bidimensional de notas de aluno
    
    //construtor de dois argumentos inicializa courseName e array de notas
    public GradeBook(String CourseName, int[][] gradesArray){
        this.courseName = CourseName;
        this.grades = gradesArray;
    }
    
    //metodo para configurar o nome do curso
    public void setCourseName(String name){
        this.courseName = name;
    }
    
    //metodo para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }
    
    //exibe a mensagem de boas vindas ao utilizador  Grabook.
    public void displayMessage(){
        System.out.printf("Seja benvindo %s \n", getCourseName());
    }
    
    //realiza varias operaçoes
    public void processGrades(){
        //gera a saida de array de notas
        outputGrades();
        //chama metodos getMinimun e getMaximum
        System.out.printf("\n%s %d\n%s %d\n\n","Lowest grade in the grade book is ", getMinimum(),
                "Highest grade in the grade book is ", getMaximun());
        //gera saida de grafico de distribuiçao dde notas de todas as notas em todos os testes
        outputBarChart();
    }
    
    //localiza a nota Minima
    public int getMinimum(){
        //assume que o primeiro elemento de array de notas é o menor
        int lowGrade = grades[0][0];
        
        //faz loop pelas linhas do array de notas
        for (int linha = 0; linha < grades.length; linha++) {
            //faz loop pelas colunas
            for (int colunas = 0; colunas < grades[linha].length; colunas++) {
                //se a nota for menor do que lowgrade. atribui a nota a lowgrad.
                if(grades[linha][colunas] < lowGrade){
                    lowGrade = grades[linha][colunas];
                }
            }
        }
        
        return lowGrade;
    }
    
    //localiza a nota Maxima
    public int getMaximun(){
        //ssume que o primeiro elemento de array de notas é a maior nota
        int highGrade = grades[0][0];
        
        //faz loop pelas linhas
        for(int linha = 0; linha < grades.length; linha++){
            //faz o loop pelas colunas
            for(int coluna = 0; coluna < grades[linha].length; coluna++){
                if(grades[linha][coluna] > highGrade){
                    highGrade = grades[linha][coluna];
                }
            }
        }
        
        return highGrade;
    }
    
    //determina a media do conjuntode particular de motas
    public double getAverage(int[] setOfGrades){
        int total = 0; // inicializa o total
        
        //soma notas de um aluno
        for(int grade : setOfGrades){
            total += grade;
        }
        
        //retorna a media de notas
        return (double) total / setOfGrades.length;
    }
    
    //gera a saida do grafico de barras para exibir distribuiçao de notas
    public void outputBarChart(){
        System.out.println("Overral grade distribution: ");
        //armanzena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];
        
        //para cada nota em Gradebook, incrementa a frequencia certa
        for(int[] studentGrades: grades){
            for(int grade: studentGrades){
                ++frequency[grade / 10];
            }
        }
        
        //para cada frequencia  de nota, imprime a barra no grafico
        for(int count = 0; count < frequency.length; count++){
            //imprimi o rotulo de barra 00-09 ...
            if(count == 10){
                System.out.printf("%5d", 100);
            }else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            
            //imprime a barra de astristicos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            
            System.out.println();//inicia uma nova linha
        }
    }
    
    //gera a saida do conteudo do array de notas
    public void outputGrades(){
        System.out.println("The grades are:\n");
        System.out.print("---------------");//alinha titulos de colunas
        
        //cria um titulo de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        
        System.out.println("Average");//titulo da coluna de media do aluno
         
        //cria linhas/colunas de texto que representan notas do array
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for(int test: grades[student]){//gera a saida de notas do aluno
                System.out.printf("%8d", test);
            }
            
            //chama metodo getAverage para calcular a media do aluno
           //passa linha de notas como argumento para getAverage
           double average = getAverage( grades[ student ]);
            System.out.printf("%9.2f\n",average);
                
        }
    }
    
}
