import java.util.Scanner;   
public class Ex_08 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = 0, soma = 0;

        while (i < 10) {
            System.out.println("digite um numero: ");
            soma += sc.nextInt();
            i++;
        }
        System.out.println("soma: "+ soma);
    }
}
