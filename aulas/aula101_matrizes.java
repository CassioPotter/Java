import java.util.Scanner;

public class aula101_matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();//quantidade de linha e coluna
        int [][] mat = new int [n] [n]; //n vai entra nas matrizes

        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                mat [x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                System.out.println(mat [x][y]);
            }
        }
        
    


        sc.close();
    }
}
