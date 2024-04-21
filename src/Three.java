/*Operadores:
*a. Escreva um programa para 
*calcular a área de um retângulo. Os comprimentos dos lados devem ser fornecidos pelo usuário. */

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1: ");
        int ladoOne = scanner.nextInt();
        
        System.out.println("Digite o lado 2: ");
        int ladoTwo = scanner.nextInt();

        int result = ladoOne * ladoTwo;

        System.out.println("O resultado é: " + result);
        
        scanner.close();
    }
}
