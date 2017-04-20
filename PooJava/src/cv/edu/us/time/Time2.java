package cv.edu.us.time;

/**
 *
 * @author Carlos-Pina
 */
public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    //construtor sem argumento Time2 : inicializa cada variavel de instacia 
    // c0m zero : assegura que objetos Time2 iniciam em um estado consistente
    public Time2(){
    }
    
    //construtor Time2: hour fornecedo, mi e sec padronizados como 0
    public Time2(int h ){
        this.hour = h;
        this.minute = 0;
        this.second = 0;
    }
    
    //construtor Time2: hour e segundo fornecedo, mi padronizados como 0
    public Time2(int h, int m ){
        this.hour = h;
        this.minute = m;
        this.second = 0;
    }
    
    //construtor Time2: hour, min e sec fornecidos
    public Time2(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    
    //construtor Time2:outro objeto Time2 fornecido
    public Time2( Time2 time){
        //invoca o construtor de tres argumentos Time2
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    
    //metodos set
    // configura um novo valor de hora usando o formato universal;
    //assegura que os dados permaneçam consistentes configurando
    //valores invalidos como zero
    public void setTime( int h, int m, int s ){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    //valida e configura a hora
    public void setHour(int h){
        hour = (( h >= 0 && h < 24 ) ? h : 0);
    }
    
    //valida e configura os minutos
    public void setMinute(int m){
        minute = ((m >= 0 && m <= 59) ? m : 0);
    }
    
    //valida e configura os segundos
    public void setSecond(int s){
        second = ((s >= 0 && s <= 59) ? s : 0);
    }
    
    //METODOS GET
    //obtem valor da hora
    public int getHour(){
        return hour;
    }
    
    //obtem o valor de minute
    public int getMinute(){
        return minute;
    }
    
    //obtem o valor se second
    public int getSecond(){
        return second;
    }
    
    //converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    //converte em String no formato padrao de data (H:MM:SS AM OU PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
