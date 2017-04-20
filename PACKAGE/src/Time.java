import cv.edu.us.time.Time1; //importação de classes noutros pacotes

public class Time {

    public static void main(String[] args) {
        //cria e inicializa um objeto time1
        Time1 time = new Time1(); //invoca o construtor Time1

        //gera saida de representações de string da hora
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();//gera saida de uma linha em branco.

        //altera a hora e gera saida da hora atualizada
        time.setTime(13, 27, 6);
        System.out.print("universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();//gera saida de uma linha em branco.

        //configura a hora com valores invalidos: gera saida da hora atualizada
        time.setTime(99, 99, 99);
        System.out.println("After attempting invalid settings: ");
        System.out.print("Universal time:");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time : ");
        System.out.println(time.toString());
        System.out.println();//gera saida de uma linha em branco.
    }
}
