package cv.edu.us.enum02;

/**
 *
 * @author Carlos-Pina
 */
public enum Book {
    //declara constantes do tipo enum
    JHTP("Java How to Program", "2010"),
    CHTP("C how to Program", "2007"),
    IW3HTP("Internet & Word Wide Web How to Program", "2008"),
    VBHTP("Visual Basic 2008 How to Program", "2008"),
    CSHARPHTP("vISUAL c# 2008 How to Program", "2009");
    
    //campo de instancia
    private final String title; //titulodo livro
    private final String copyrightYear; //ano dos direitos autoriais
    
    //construtor enum

    private Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }
    
    //metodo de acesso para titulo
    public String getTitle(){
        return title;
    }
    
    //metodo de acesso para o campo copyrightYear
    public String getCopyrightYear(){
        return copyrightYear;
    }
    
}
