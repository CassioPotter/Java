import java.util.Scanner;

public class aula044_while{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x=0;
        int soma=0;

        System.out.println("Digite um valor para somar e [0] para sair:");
        x=sc.nextInt();

        while (x != 0) {
            System.out.println("Digite um valor para somar e [0] para sair:");
            x=sc.nextInt();

            soma=soma + x;
            
        }
        System.out.printf("A soma dos valores deu %d", soma);
    }
}