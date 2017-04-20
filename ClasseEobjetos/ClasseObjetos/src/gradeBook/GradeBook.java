package gradeBook;

import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class GradeBook {
    private String courseName; //nome do curso para GradeBook
    private int total; //soma  das notas
    private int gradeCounter; // numero de notas inseridas.
    private int aCount; // Contagem de  nota A
    private int bCount; // Contagem da nota b
    private int cCount; // Contagem da nota c
    private int dCount; // Contagem da nota d
    private int fCount; // Contagem da nota f
    
    //o contrutor inicializa courseName ao criar um objeto com new.
    public GradeBook(String courseName) {
        this.courseName = courseName;
    }
    
    //metodo para configurar o nome  do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }//fim do metodo setCourseName
    
    //metodo para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    } // fim do metodo getCourseName

    
    //metodo void(tipo retorno) no caso nao devolve nada somente executa uma tarefa.
    public void displayMessage(){
        //chama getCourseName para obter o curso.
        System.out.printf("Welcome to the Grade Book \n%s\n", getCourseName());
    } //fim do metodo displayMessage
    
    
    public void inputGrades(){
        Scanner ler = new Scanner(System.in);
        int grade; //nota inserida pelo utilizador.
        
        do{
            System.out.println("Informe o numero ou [-1] para finalizar!");
            grade = ler.nextInt();
            
            if(grade != -1){
                total += grade;
                ++gradeCounter;
                
                this.imcrementLetterGradeCounter(grade);
            }
            
        }while(grade != -1);
    } //fim do metodo inputGrades
    
    
    private void imcrementLetterGradeCounter(int grade){
        switch(grade/10){
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            case 7:
                ++cCount;
                break;
            case 6:
                ++dCount;
                break;
            default:
                ++fCount;
                break;
        }//fim do switch
    }//fim do metodo imcrementLetterGradeCounter
    
    public void displayGradeReport(){
        System.out.println("\nGrade Report:");
        
        //se o utilizador inseriu pelo menos uma nota...
        if(gradeCounter != 0){
            //calcula a media de todoas as notas inseridas
            double average = (double) total/gradeCounter;
            
            //gera a saida de resumo de resultados
            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n","Number of students who received each grade: ",
                    "A: ", aCount,  //exibe o numero de notas A
                    "B: ", bCount, //exibe o numero de notas B
                    "C: ", cCount, //exibe o numero de notas C
                    "D: ", dCount, //exibe o numero de notas D
                    "F: ", fCount); //exibe o numero de notas F
        }else{
            System.out.println("No grades were ebtered");
        }
    }
} //fim da classe GradeBook
