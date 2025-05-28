import java.util.Scanner;

public class Ex_07 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int idade;

        do{
            System.out.println("digite sua idade (0-120)");
            idade = sc.nextInt();
        }while (idade < 0 || idade > 120);
        System.out.println("Idade valida: "+ idade);

    }
    
}
