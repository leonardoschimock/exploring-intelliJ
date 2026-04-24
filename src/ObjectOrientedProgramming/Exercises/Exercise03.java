package ObjectOrientedProgramming.Exercises;

import java.util.Scanner;

/******************************************************************************************************************
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*******************************************************************************************************************/

public class Exercise03 {
    void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a diferença entre dois produtos!");
        System.out.println("Informe os dois primeiros números para calcular o primeiro produto:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("\nNúmeros digitados: %d x %d = %d\n", a, b, a * b);
        System.out.println("Informe mais dois números para a segunda multiplicação: ");

        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.printf("\nNúmeros digitados: %d x %d = %d \n", c, d, c * d);

        int diferenca = (a * b - c * d);

        System.out.printf("A diferença entre %d x %d e %d x %d é = %d", a, b, c, d, diferenca);

        scanner.close();
    }
}
