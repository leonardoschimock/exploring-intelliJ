package ObjectOrientedProgramming.Exercises;

import java.util.Locale;
import java.util.Scanner;

/******************************************************************************************************************
 Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 mostre:
 a) a área do triângulo retângulo que tem A por base e C por altura.
 b) a área do círculo de raio C. (pi = 3.14159)
 c) a área do trapézio que tem A e B por bases e C por altura.
 d) a área do quadrado que tem lado B.
 e) a área do retângulo que tem lados A e B.
 ******************************************************************************************************************/

public class Exercise06 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaTriangulo = (a * c) / 2;

        double pi = 3.14159;
        double areaCirculo = pi * Math.pow(c, 2);

        double areaTrapezio = ((a + b) / 2) * c;

        double areaQuadrado = Math.pow(b, 2);

        double areaRetangulo = a * b;

        System.out.println("a) Area do Triângulo = " + areaTriangulo);
        System.out.printf("b) Area do Circulo = %.2f\n", areaCirculo);
        System.out.println("c) Area do Trapézio = " + areaTrapezio);
        System.out.println("d) Area do Quadrado = " + areaQuadrado);
        System.out.println("e) Area do Retângulo = " + areaRetangulo);
    }
}
