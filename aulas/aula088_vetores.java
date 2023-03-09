import java.util.Scanner;

public class aula088_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n=sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i<n; i++ ){
            vect [i] = sc.nextDouble() // vai recebendo o que o usuario digitar criando um vetor de n lugares
        }

        sc.close();
    }
    
}
