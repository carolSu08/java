import java.util.Scanner;
public class Ex_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero para calcular o fatorial: ");
        int num = sc.nextInt();
        int fatorial = 1;
        while (num > 1) {
            fatorial *= num;
            num--;
        }
        System.out.println("fatorial: "+ fatorial);
    }
}
