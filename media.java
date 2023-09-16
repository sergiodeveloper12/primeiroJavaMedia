
import java.util.Scanner;


public class media {




    public static void media(String[] args) {
        int nota1, nota2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite nota 1: ");
        nota1 = scanner.nextInt();

        System.out.print("Digite nota 2: ");
        nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2.0;

        if (media >= 7.0) {
            System.out.println("Promovido");
        } else {
            System.out.println("Retido");
        }

        scanner.close();
    }
}

