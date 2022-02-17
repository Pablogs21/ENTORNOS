import java.util.Scanner;
public class Agenda{

    public static void main(String[]args){
            boolean nombre = false;
            String matriz[][]= {{"Paco","2345"}, {"Javi","5678"}, {"Ismael","8901"}, {"Manuel","7234"}, {"Antonio","2106"}};
        for(int i=0; i < matriz.length; i++){
            if( matriz[i][0].equals(args[0])){
                System.out.println("El telefono es: " +matriz[i][1]);
                 nombre = true;
            }
            
            

        }
        if (nombre == false){
                System.out.println("Este telefono no se ecuentra");
            }
    }
}