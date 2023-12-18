package HW_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("Posytman installed");

        //2
        manipulate(10, 5);

        //3
        printOddNumbers(10);

        //4
        swapVariable(10, 5);

        //5
        printMax(5, 4, 3);

        //6
        checkNumber(-4);

        //7
        System.out.println(replaceAToB("aaabbbsssaatt"));

        //8
        int[] array8 = {10, 20, 30, 40, 50, 60};
        System.out.println(sumFromArray(array8));

        //9
        System.out.println();
        System.out.println(findSecondLargestNumber(array8));

        //10
        //   https://leetcode.com/problems/shuffle-string/submissions/1122607023/
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

        //11
        //  https://leetcode.com/problems/palindrome-number/
        System.out.println(isPalindrome(121));

        //12
        //   https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/1122612578/
        System.out.println(numberOfSteps(14));

        //13
        //   https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/1122616109/
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));

        //14
        //


    }

    public static void manipulate(double x, double y){
        System.out.println("Sum = " + (x + y));
        System.out.println("Multiplication = " + (x * y));
        System.out.println("Subtraction = " + (x - y));
        if(y != 0){
            System.out.println("Division = " + (x / y));
            System.out.println("Remainder(x / y) = " + (x % y));
        } else {
            System.out.println("Division by 0 is not possible");
        }
    }

    public static void printOddNumbers(int maxLength){
        for (int i = 1; i < maxLength; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void swapVariable(double x, double y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void printMax(double x, double y, double z){
        System.out.println("Max is " + Math.max(x, Math.max(y, z)));
    }

    private static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " является положительным числом.");
        } else if (number < 0) {
            System.out.println(number + " является отрицательным числом.");
        } else {
            System.out.println(number + " является нулем.");
        }
    }

    private static String replaceAToB(String str){
        char[] chars = str.toCharArray();
        String answer = "";

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a'){
                answer += 'b';
            }else{
                answer += chars[i];
            }
        }
        return answer;
    }

    private static int sumFromArray(int[] array8) {
        int sum = 0;
        for (int i = 0; i < array8.length; i++) {
            sum += array8[i];
        }
        return sum;
    }

    private static int findSecondLargestNumber(int[] arr){
        if(arr.length < 2) {
            return arr[0];
        }
        Arrays.sort(arr);

        return arr[arr.length - 2];

    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder();
        int k = 0;

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if(indices[j] == k){
                    str.append(s.charAt(j));
                    break;
                }
            }
            k++;
        }

        return str.toString();
    }

    public static boolean isPalindrome(int x) {

        String res = new String(String.valueOf(x));
        String reversed = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            reversed += res.charAt(i);
        }
        if(res.equals(reversed)){
            return true;
        }else{
            return  false;
        }
    }

    public static int numberOfSteps(int num) {
        int indicator = 0;
        while(num != 0){
            if(num % 2 == 0){
                System.out.println(num + " is even; divide by 2 and obtain " + (num / 2) + ".");
                num = num / 2;
            }else{
                System.out.println(num + " is odd; subtract 1 and obtain " + (num - 1) + ".");
                num = num - 1;
            }
            indicator++;
        }
        return indicator;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }

        return str1.equals(str2);
    }
}
