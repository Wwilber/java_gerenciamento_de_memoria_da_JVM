package aula_9_1_Estrutura_da_memoria_da_JVM;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
    }

}
