import java.util.Scanner;
public class exe004{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("\nDigite uma frase para tela em maiuscula e minuscula");
        frase =sc.next();
        
        String minuscula=frase.toLowerCase();
        System.out.println(minuscula);
    
        String maiuscula = frase.toUpperCase();
        System.out.println(maiuscula);
    
    
    
    }





}
