package gradeBook4;

/**
 *
 * @author Carlos-Pina
 */
public class LivroNotas {
    private String nomeDisciplina;
    int[][] arrayNota;
    Aluno[] arrayNome;
    
    public LivroNotas(String nomeDisciplina, int[][] arrayNotas, Aluno[] arrayNome){
        this.nomeDisciplina = nomeDisciplina;
        this.arrayNota = arrayNotas;
        this.arrayNome = arrayNome;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void apresentaMensagem(){
        System.out.printf("Seja Benvindo ao Livro da disciplina de %s\n\n", getNomeDisciplina());
    }
    
    public void exOperacoes(){
        outputNota();
        outputGrafico();
        
        System.out.printf("\nA nota minima é %d e a nota maxima é %d\n", getMinimo(), getMaximo());
        
    }
    
    private int getMinimo(){
        int minNota = arrayNota[0][0];
        for(int[] array: arrayNota){
            for(int nota: array){
                if(nota < minNota){
                    minNota = nota;
                }
            }
        }
        return minNota;
    }
    
    private int getMaximo(){
        int maxNota = arrayNota[0][0];
        for(int[] array: arrayNota){
            for(int nota: array){
                if(nota > maxNota){
                    maxNota = nota;
                }
            }
        }
        return maxNota;
    }
    
    private double getMediaAluno(int[] arrayNota){
        int total = 0;
        for(int nota: arrayNota){
            total += nota;
        }
        return (double) total/ arrayNota.length;
    }
    
    private void outputNota(){
        System.out.printf("As Notas da disciplina de %s são:\n",getNomeDisciplina());
        System.out.print("                      ");
        for(int test = 0; test < arrayNota[0].length; test++){
            System.out.printf("%dº Teste ", test + 1);
            System.out.print("   ");
        }
        
        System.out.println("Media");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (int student = 0; student < arrayNota.length; student++) {
            System.out.printf("%19s", arrayNome[student]);
            
            for (int nota = 0; nota < arrayNota[student].length; nota++) {
                System.out.printf("%9d", arrayNota[student][nota]);
            }
            
            double media = getMediaAluno(arrayNota[student]);
            System.out.printf("%14.2f", media);
            
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        }
    }
    
    private void outputGrafico(){
        int[] frequencia = new int[3];
        for (int[] linha: arrayNota) {
            for(int nota: linha){
                ++frequencia[nota / 10];
            }
        }
        System.out.println("\nGrafico de Barra:");
        for (int i = 0; i < frequencia.length; i++) {
            if(i == 2){
                System.out.printf("%d", 20);
            }else{
                System.out.printf("%02d-%02d", i * 10, i * 10 + 9);
            }
            
            for (int stars = 0; stars < frequencia[i]; stars++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    
    
}
