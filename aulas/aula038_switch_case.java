import java.util.Scanner;

public class aula038_switch_case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x;
        String dia;

        System.out.println("Qual o numero do dia?");
        x =sc.nextInt();

        switch (x){
            case 1:
            dia="domingo";
            break;
            
            case 2:
            dia="segunda";
            break;

            case 3:
            dia="terça";
            break;
            
            case 4:
            dia="quarta";
            break;

            case 5:
            dia="quinta";
            break;

            case 6:
            dia="sexta";
            break;

            case 7:
            dia="sabado";
            break;

            default:
            dia="valor digitado invalido";
            break;
        }
         System.out.println("Hoje é dia "+dia);

    }
}
