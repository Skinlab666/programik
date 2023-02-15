import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

        System.out.println("Dodawanie " + addition);
        System.out.println("Odejmowanie " + substraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Modulo " + modulo);
    }
}