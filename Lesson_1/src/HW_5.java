import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
        //1
        int a = 6;
        int b = 5;
        if(a==b) System.out.println("квадрат");
        else System.out.println("не квадрат");
        //2
        int cost = 4000;
        if(cost > 5000) System.out.println(cost - (cost/10));
        else System.out.println(cost);
        //3
        int grade = 79;
        if(grade<25){
            System.out.println("F");
        }else if(grade>25 && grade<45){
            System.out.println("E");
        }else if(grade>45 && grade<50){
            System.out.println("D");
        }else if(grade>50 && grade<60){
            System.out.println("C");
        }else if(grade>60 && grade<80){
            System.out.println("B");
        }else if(grade>80){
            System.out.println("A");
        }
        //4
        double number = 12345;
        String temp = String.valueOf(number);
        StringBuilder answer1 = new StringBuilder(temp);
        System.out.println(answer1.reverse());

        char[] charArr = temp.toCharArray();
        String answer2 = "";
        for (int i = charArr.length - 1; i >= 0 ; i--) {
            answer2 += charArr[i];
        }
        System.out.println(answer2);
        //5
        int chislo = 12;
        int otvet = 0;
        for (int i = 1; i < chislo; i++) {
            if(chislo % i == 0){
                otvet++;
            }
        }
        if(otvet <= 2){
            System.out.println("простое");
        }else{
            System.out.println("NO!");
        }
        //6
        System.out.println("I)");
        for (int i = 0; i < 4; i++) {
            System.out.println("**********");
        }

        System.out.println("II)");
        String tempp = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(tempp);
            tempp +="*";
        }

        System.out.println("III)");
        double n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();

        }
        //7
        int a1 = 5;
        int b1 = 10;
        int sum = 0;
        for (int i = a1 + 1; i < b1; i++) {
            if(i>0)
                sum+=i;
        }
        System.out.println(sum);
        //8
        double salary = 5000;
        char employeeClass = 'B';
        double bonus = 0.0;
        switch (employeeClass) {
            case 'A':
                bonus = 0.5 * salary;
                break;
            case 'B':
                bonus = 0.25 * salary;
                break;
            case 'C':
                bonus = 0.0;
                break;
            default:
                System.out.println("Неверный класс сотрудника.");
                return;
        }
        System.out.println(salary + bonus);

        //9
        fibonacci(5);


    }
    public static void fibonacci(int fibonacciNum){
        int n = fibonacciNum;

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
