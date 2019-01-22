package calculator;

import java.util.Scanner;

import static calculator.AvailableOperations.PLUS;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AvailableOperations operations = new AvailableOperations();

        System.out.println("Podaj liczbe zmiennoprzecinkowa");
        double firstNumber = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj znak dzialania ktore chcesz wykonac");
        String operator = sc.nextLine();
        boolean wrongOperator = true;
        while(wrongOperator) {
            if(!operator.matches("\\+|\\-|\\*|\\/")) {
                System.out.println("Podaj poprawny znak dzialania : +, -, *, lub /");
                wrongOperator = true;
                operator = sc.nextLine();
            } else {
                wrongOperator = false;
            }

        }
        System.out.println("Podaj kolejna liczbe zmiennoprzecinkowa");
        double secondNumber = sc.nextDouble();

        sc.close();

        System.out.println("a = " + firstNumber);
        System.out.println("b = " + secondNumber);
        System.out.println("a " + operator + " b = " + operations.calculateResult(firstNumber, secondNumber, operator));
    }
}
