package ObjectOrientedProgramming.Exercises;

import java.util.Scanner;

/*******************************************************************************************************
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 mensagem explicativa.
 ******************************************************************************************************/

public class Exercise01 {
    void main(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Informe um segundo número para somar: ");
        int segundoNumero = scanner.nextInt();
        scanner.close();

        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " é " + soma);
    }
}
