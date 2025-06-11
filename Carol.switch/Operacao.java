import java.util.Scanner;

public class Operacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero 1: ");
        int n1 = scanner.nextInt();

        System.out.println("digite o numero 2: ");
        int n2 = scanner.nextInt();

        System.out.print("digite uma dessas operacoes (+,-,*,/): ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case +:
                int total = n1 + n2;
                System.out.println("o resultado é: "+ total);
                break;

            case -:
                int total = n1- n2;
                System.out.println("o resultado é: "+ total);
                break;

            case *:
                int total = n1 * n2;
                System.out.println("o resultado é: "+ total);
                break;

            case /:
                int total = n1 / n2;
                System.out.println("o resultado é: "+ total);
                break;
        
            default:
            break;
        }
    }
}