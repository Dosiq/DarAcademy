package HW_11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        double num;

        try {
            System.out.print("Enter double: ");
            num = sc.nextDouble();
            System.out.println("Your number: " + num);
        }catch (InputMismatchException e){
            System.out.println("Enter double please!");
        }

        //2
        try {
            System.out.println(divide(5, 0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        //3
        sc.nextLine();
        String message = sc.nextLine();
        try {
            int sum = sumIntegersFromString(message);
            System.out.println("Сумма целых чисел в строке равна " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Невозможно извлечь целое число из строки.");
        } finally {
            sc.close();
        }

    }

    public static double divide(double x, double y){
        if(y == 0){
            throw new ArithmeticException("You can't divide by zero!");
        }
        return x/y;
    }




    private static int sumIntegersFromString(String input) {
        Scanner scanner = new Scanner(input);
        int sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                scanner.next();
            }
        }

        return sum;
    }
}
