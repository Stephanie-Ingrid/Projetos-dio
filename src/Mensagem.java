
import java.time.LocalDateTime;

public class Mensagem {

    public static void main(String[] args) {
        LocalDateTime ltd = LocalDateTime.now();

        int hora = ltd.getHour();

        if(hora <= 11){
            System.out.println("Bom dia! ☺ ");
        }
        else if(hora <= 17 ) {
            System.out.println("Boa tarde! ♥ ");
        }
        else {
            System.out.println("Boa noite! ○ ");
        }
    }

}