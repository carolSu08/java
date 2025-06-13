import java.util.Scanner;

public class dieta {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("quantas calorias vc pode por dia?: ");
        int dia = scan.nextInt();

        System.out.println("qauntas refeicoes voce fez hj?: ");
        int ref = scan.nextInt();

        if (ref = 1){

        }

        System.out.println("proteina: ");
        int proteina = scan.nextInt();

        System.out.println("gordura: ");
        int gordura = scan.nextInt();

        System.out.println("carboidrato: ");
        int carboidrato = scan.nextInt();

        int calorias = (proteina * 4 )+ (gordura * 9 )+ (carboidrato* 4);





    }

}
