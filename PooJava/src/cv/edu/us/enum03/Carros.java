package cv.edu.us.enum03;

/**
 *
 * @author Carlos-Pina
 */
public enum Carros {
   MC("Mercedes", "2000"), TY("Toyota", "2007"), MS("Mitsubshi", "1990"), TC("Tacoma", "1996");
   
   private String title;
   private String anoFabrico;
   
   Carros(String title, String anoFabrico){
       this.title = title;
       this.anoFabrico = anoFabrico;
   }
   
   public String getTitle(){
       return title;
   }
   
   public String getAnoFabrico(){
       return anoFabrico;
   }
}
