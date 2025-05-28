import java.util.Scanner;

public class Ex_12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int soma = 0, num;

        while(soma <= 100){
            System.out.print("digite um numero: ");
            num = sc.nextInt();
            soma += num;
        }
        System.out.println("soma final: "+ soma);
    }    
}
