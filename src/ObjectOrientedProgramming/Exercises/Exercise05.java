package ObjectOrientedProgramming.Exercises;

import java.util.Locale;
import java.util.Scanner;

/*****************************************************************************************************************
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 *****************************************************************************************************************/

public class Exercise05 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código da peça?");
        int codigo = scanner.nextInt();

        System.out.println("Quantidade?");
        int quantidade = scanner.nextInt();

        System.out.println("Preço unitário?");
        double price = scanner.nextDouble();

        System.out.println("Código do produto?");
        int codeProduto = scanner.nextInt();

        System.out.println("Quantidade do produto?");
        int qtdProduto = scanner.nextInt();

        System.out.println("Preço unitário do produto?");
        double priceProduto = scanner.nextDouble();

        double valorPagar = (quantidade * price) + (qtdProduto * priceProduto);

        System.out.printf("VALOR A PAGAR: R$%.2f", valorPagar);

    }
}
