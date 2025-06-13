import java.util.Scanner;

public class festa{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(":");
            int n1 = scan.nextInt();
            scan.nextLine();

            System.out.println(":");
            int n2 = scan.nextInt();
            scan.nextLine();

            System.out.println(":");
            int n3 = scan.nextInt();
            scan.nextLine();
            
            int soma = (n1-n2)+(n2+n3)+(n3-n1);

            //int t1 = n1 + n2;
            //int t2 = n2 + n3;
            //int t3 = n3 + n1;

            //int soma = t1 - t2 - t3;
            System.out.println("Resultado: " + soma);
        }
    }
}