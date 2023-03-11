import java.util.Scanner;
import java.lang.Math;

public class aula027_raiz_e_potencia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float numero;
        float a;
        float b;

        System.out.println("Digite um valor para saber sua raiz e potencia ao quadrado:");
        numero = sc.nextFloat();

        a = (float) Math.sqrt(numero);
        b = (float) Math.pow(numero, 2);

        System.out.printf("A raiz de %.2f é %.2f ",numero, a);
        System.out.printf("O valor %.2f ao quadrado é %.2f",numero, b);

        sc.close();




    }
}
