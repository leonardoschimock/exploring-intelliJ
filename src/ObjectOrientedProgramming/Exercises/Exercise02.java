package ObjectOrientedProgramming.Exercises;

import java.util.Locale;
import java.util.Scanner;

/*******************************************************************************************************************
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 casas decimais.

 Fórmula da área: area = π . raio2

 Considere o valor de π = 3.14159
 *******************************************************************************************************************/

public class Exercise02 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio de um circulo hipotético:");
        double raio = scanner.nextDouble();
        scanner.close();

        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("\nÁrea do seu círculo: %.4f\n", area);
    }
}
