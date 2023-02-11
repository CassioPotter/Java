import java.util.Scanner;
public class exe020 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in) ;
        int numero1;
        int numero2;
        int multi;
        int divi;
        int soma;
        int sub;

        System.out.println("%n Digite o primeiro valor:");
        numero1=sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        numero2=sc.nextInt();

        soma=numero1+numero2;
        sub=numero1-numero2;
        multi=numero1*numero2;
        divi=numero1/numero2;

        System.out.printf( "A soma do %d + %d = %d/n", numero1, numero2, soma);
        System.out.printf( "A subtração do %d + %d = %d /n", numero1, numero2, sub);
        System.out.printf( "A multiplicação do %d + %d = %d /n", numero1, numero2, multi);
        System.out.printf( "A divisão do %i + %d = %d /n", numero1, numero2, divi);




    }

}
