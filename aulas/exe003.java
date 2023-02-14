import java.util.Scanner;

public class exe003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        int numero1;
        int numero2;
        int total;

        System.out.println("Por favor digite o primeiro valor: ");
        numero1=sc.nextInt();
        System.out.println("Por favor digite o segundo valor: ");
        numero2=sc.nextInt();

        total=numero1+numero2;

        System.out.printf("A soma de %d + %d = %d", numero1, numero2, total);


    }
    
}
