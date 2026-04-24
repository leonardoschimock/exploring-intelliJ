package ObjectOrientedProgramming.Exercises;

import java.util.Locale;
import java.util.Scanner;

/******************************************************************************************************************
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 decimais.
******************************************************************************************************************/

public class Exercise04 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu número interno: ");
        int numeroInterno = scanner.nextInt();

        System.out.println("Informe suas horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Informe seu salário por hora: ");
        double salarioHora = scanner.nextDouble();

        double salario =horasTrabalhadas * salarioHora;

        System.out.println("Nº do FUNCIONÁRIO: " + numeroInterno);
        System.out.printf("SALÁRIO: R$%.2f\n", salario);
    }
}
