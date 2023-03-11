import java.util.Scanner;

public class aula025 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String nome;
        int inteiro;
        double flutuante;
        char letra;



        System.out.println("Nome:");
        nome = sc.next();

        System.out.println("Numero inteiro:");
        inteiro =sc.nextInt();

        System.out.println("Numero flutuante;");
        flutuante = sc.nextDouble();

        System.out.println("Letra:");
        letra = sc.next().charAt(0);

        System.out.println(nome);
        System.out.println(inteiro);
        System.out.println(flutuante);
        System.out.println(letra);


        sc.close();
        
        
    }



    
}
