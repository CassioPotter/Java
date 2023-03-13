import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class aula106_data_hora {
    public static void main(String[] args) {
        
        //instanciar data
        //data local
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        //data e hora local
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        //data hora global gnt
        Instant d03 = Instant.now();
        System.out.println(d03);
    }
}
