import java.util.Scanner;

public class Ex_09 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num, positivos = 0;

        do{
            System.out.println("digite um numero (-1 para sair): ");
            num = sc.nextInt();

            if(num > 0)positivos++;
        }while (num != -1);
        System.out.println("Total de numeros positivos: "+ positivos);
    }
}    