package aula058_string;
import java.util.Scanner;
public class aula058_string {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner (System.in);
		String frase;
		
		System.out.println("Digite uma frase:");
		frase=sc.nextLine();
		
		String s1 = frase.toLowerCase();
		String s2 = frase.toUpperCase();
		String s3 = frase.trim();
		String s4 = s3.substring(4,8);
				
		System.out.println(frase);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
}
