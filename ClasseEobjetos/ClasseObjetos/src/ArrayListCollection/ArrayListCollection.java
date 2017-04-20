package ArrayListCollection;

import java.util.ArrayList;

/**
 *
 * @author Carlos-Pina
 */
public class ArrayListCollection {
    public static void main(String[] args) {
       //cria um novo ArrayList de strings
       ArrayList< String > itens = new ArrayList< String >();
       
       itens.add("Red"); //acrescenta um item no final da lista
       itens.add(0, "yellow"); //inseri o valor no indice indicado
       
       //cabeçalho
        System.out.print("Display list contents with counter-controlled loop: ");
        
        //exibe as cores na lista
        for( int i = 0; i < itens.size(); i++){
            System.out.printf(" %s",itens.get(i));
        }
        System.out.println();
        
        //exibe as cores utilizando foreach no metodo display
        display(itens, "\nDisplay list contents with enhaced for statement: ");
        
        itens.add("green"); //adiciona green no final da lista
        itens.add("yellow"); // adiciona yellow no final da lista
        display(itens, "Lis with two new elements: ");
        
        itens.remove("yellow"); //remove o primeiro yellow
        display(itens, "Remove first instance of yellow: ");
        
        itens.remove(1); //remove o item no indice 1
        display(itens, "Remove second list element (green): ");
        
        //verifica se o valor esta na lista 
        System.out.printf("\"red\" is %sin the list\n", itens.contains("Red") ? " " : "not");
        
        //exibe o numero de elementos em list
        System.out.printf("Size: %d\n", itens.size());
    }
    
    public static void display( ArrayList< String > itens, String header){
        System.out.printf("%s ", header); //exibe o cabeçalho
        for(String iten: itens){
            System.out.printf(" %s", iten);
        }
        System.out.println();
    }
}
