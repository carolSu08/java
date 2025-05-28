import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String senha = "";

        while (!senha.equals("1234")){
            System.out.println("digite a senha: ");
            senha = sc.nextLine();
        }

        System.out.println("senha correta!");
    }
}
