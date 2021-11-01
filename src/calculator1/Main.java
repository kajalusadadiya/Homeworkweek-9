package calculator1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice = 'y';
        int a, b;
        char symbol;
        while (choice == 'y') {
            System.out.println("Enter the first Number: ");
            a = scan.nextInt();

            System.out.println("Enter the second Number: ");
            b = scan.nextInt();

            System.out.println("Enter the symbol (+, -, *, /): ");
            symbol = scan.next().charAt(0);

            calc.calculateResult(a, b, symbol);

            System.out.println("Would you like to do  more calculation Please enter Y or N :");
            choice = scan.next().toLowerCase().charAt(0);

        }

    }
}


