package cv.edu.us.time;

public class Time1 {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    //configura um novo valor de hora usando formato universal:
    //assegura que os dados permaneçam consistentes configurandi valores invalidos como zero
    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0); //valida horas
        minute = ((m >= 0 && m < 60) ? m : 0); //valida minutes
        second = ((s >= 0 && s < 60) ? s : 0); //valida segundos
    }

    //converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //converte em String no formato padrao hora (H:MM:SS)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
