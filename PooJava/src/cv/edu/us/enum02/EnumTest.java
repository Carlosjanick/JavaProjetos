package cv.edu.us.enum02;

import java.util.EnumSet;

/**
 *
 * @author Carlos-Pina
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:\n");
        
        //imprime todos os livros em enum Book
        for(Book b: Book.values()){
            System.out.printf("%-10s%-45s%s\n", 
                    b,
                    b.getTitle(), b.getCopyrightYear());
        }
        
        System.out.println("\nDisplay a range of enum constantes:\n");
        //imprime os primeiros quatro livros
        //intervalo EnumSet.range(Book.JHTP, Book.VBHTP) 
        for(Book book: EnumSet.range(Book.JHTP, Book.VBHTP)){
            System.out.printf("%-10s%-45s%s\n", 
                    book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
