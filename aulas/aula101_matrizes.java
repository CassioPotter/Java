import java.util.Scanner;

public class aula101_matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o numero de colunas e linhas: ");
        int n = sc.nextInt();//quantidade de linha e coluna
        int [][] mat = new int [n] [n]; //n vai entra nas matrizes

        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                mat [x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                System.out.print(mat [x][y] + " ");
            }
        }
        
    


        sc.close();
    }
}
