/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

 import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
    
    String opcao = JOptionPane.showInputDialog("digite uma opçao:");
    
    
     void somar(){
         
        Scanner x = new Scanner (System.in);
        int numero1, numero2;
        
        System.out.println("digite o numero 1: ");
        numero1 = x.nextInt();
        
        System.out.println("digite o numero 2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 + numero2;
        System.out.println("o valor da soma e: "+ adicao);
            
    }
    
    void Subtracao(){
        
        Scanner x = new Scanner (System.in);
        int numero1, numero2;
        
        System.out.println("digite o numero 1: ");
        numero1 = x.nextInt();
        
        System.out.println("digite o numero 2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 - numero2;
        System.out.println("o valor da soma e: "+ adicao);
    }
    
    void Multiplicacao (){
        
        Scanner x = new Scanner (System.in);
        int numero1, numero2;
        
        System.out.println("digite o numero 1: ");
        numero1 = x.nextInt();
        
        System.out.println("digite o numero 2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 * numero2;
        System.out.println("o valor da soma e: "+ adicao);
    }
    
    void Divisao(){
        
        Scanner x = new Scanner (System.in);
        int numero1, numero2;
        
        System.out.println("digite o numero 1: ");
        numero1 = x.nextInt();
        
        System.out.println("digite o numero 2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 / numero2;
        System.out.println("o valor da soma e: "+ adicao);
    }
}
