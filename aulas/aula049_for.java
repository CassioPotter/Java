import java.util.Scanner;

public class aula049_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        int soma=0;
        int n=0;
        int x=0;

        System.out.println("Quantas vezes queres repetir a soma? ");
        n = sc.nextInt();

        for ( int i=0; i<n; i=i+1){
            System.out.println("Digite um valor:");
            x=sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Você digitou "+n+" valores e a sua soma deu "+soma);

        sc.close();

    }
    
}
