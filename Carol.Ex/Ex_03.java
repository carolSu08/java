import java.util.Scanner;

public class Ex_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;

        do {
            System.out.println("digite um numero (0 para sair): ");
            num = sc.nextInt();
            soma += num ;
        }while (num != 0 );
            System.out.println("soma total: "+ soma);

    }
}