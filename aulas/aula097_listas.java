import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula097_listas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,9); // na posição 2 vai ser incrementado o numero 9

        System.out.println("\n");
        for (Integer x : list){
            System.out.println(x);
        
        }
        sc.close();



    }

}
