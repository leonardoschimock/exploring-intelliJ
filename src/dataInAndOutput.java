import java.util.Scanner;

public class dataInAndOutput {
    public static void main (String[] args) {
//        System.out.println ("Hello I print and skip to next line");
//        System.out.print ("Hello I print everything on the same line");
//        System.out.printf ("Hello I do the formatted print");


        Scanner scanner = new Scanner(System.in);

        System.out.println ("Hello type your name: ");
        String name = scanner.nextLine();
        System.out.println ("Name: " + name);

        System.out.println ("Type your age: ");
        int age = scanner.nextInt();
        System.out.println ("Age: " + age);

        System.out.println ("Type if you have a work: yes (true) or not (false): ");
        boolean working = scanner.nextBoolean();
        System.out.println ("Working: " + working);
    }
}
