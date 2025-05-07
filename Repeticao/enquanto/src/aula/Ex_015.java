package aula;

import java.util.Scanner;

public class Ex_015 {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int cont = 0;
        double produto;
        double total = 0;

        while (cont <= 4){
            System.out.println("digite o valor do produto: ");
            produto = cc.nextInt();
            System.out.println("produto"+ cont + "valor: "+ produto);
            total = total + produto;

            cont++;
        }
        System.out.println("o valor do produto é: "+ total);
    }
}
