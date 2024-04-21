/*
 * Entrada e Saída de Dados:
*a. Solicite ao usuário que insira seu nome e idade. Em seguida, imprima uma mensagem de boas-vindas com esses detalhes.
*b. Solicite ao usuário que insira dois números inteiros. Some esses números e imprima o resultado.
 */

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println("O usuario " + name + " tem " + age + " anos.");

        scanner.close();
    }
}
