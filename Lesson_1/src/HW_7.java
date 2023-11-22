import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_7 {
    public static void main(String[] args) {
      System.out.println(findMin(25,37,29));
      System.out.println(calculateAverage(25,45,65));
      System.out.println(countVowels("DarTech123"));
      System.out.println(countWords("Java is good to learn Object Oriented programming."));
      System.out.println(countDigitTwo(1254212));
      System.out.println(areAllVowels("AIEEE"));
      System.out.println(calculatePentagonArea(5, 6));
      System.out.println(calculateSumOfDigits(252));
      int[] arr = {10, 30, 20, 5 ,100 ,200};
      System.out.println(findMax(arr));
      System.out.println(formatTime(3666));
      System.out.println(isPalindrome("adda"));
      writeIncrease(1, 10);
      System.out.println();
      System.out.println(fibonacci(5));
      System.out.println(returnDegree(10, 3));
      System.out.println(findMaxElement(arr, 0, arr.length - 1));
      System.out.println(findSumOfArray(arr, 0));

    }

    //1
    public static int findMin(int a, int b, int c){
      return Math.min(Math.min(a, b), c);
    }


    //2
    public static double calculateAverage(int a, int b, int c) {
      return (a + b + c) / 3.0;
    }

    //3
    public static int countVowels(String str) {
      int count = 0;
      for (char ch : str.toLowerCase().toCharArray()) {
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
              count++;
          }
      }
      return count;
    }

    //4
    public static int countWords(String str) {
      String[] words = str.split("\\s+");
      return words.length;
    }

    //5
    public static int countDigitTwo(int num) {
      int count = 0;
      while (num > 0) {
          if (num % 10 == 2) {
              count++;
          }
          num /= 10;
      }
      return count;
    }

    //6
    public static boolean areAllVowels(String str) {
      for (char ch : str.toLowerCase().toCharArray()) {
          if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
              return false;
          }
      }
      return true;
    }

    //7
    public static double calculatePentagonArea(int sides, double length) {
      return (5 * length * length) / (4 * Math.tan(Math.PI / sides));
    }

    //8
    public static int calculateSumOfDigits(int num) {
      int sum = 0;
      while (num > 0) {
          sum += num % 10;
          num /= 10;
      }
      return sum;
    }

    //9 доп задача
    //9.1
    public static int findMax(int[] arr){
      int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, i);
      }
      return max;
    }

    //9.2
    public static String formatTime(int totalSeconds){
      String time = "";
      int hours = totalSeconds / 3600;
      int minutes = (totalSeconds % 3600) / 60;
      int seconds = totalSeconds % 60;

      time = hours + ":" + minutes + ":" + seconds;
      return time;
    }

    //9.3
    public static boolean isPalindrome(String str){
      String checker = "";
      for (int i = str.length() - 1; i >= 0; i--) {
        checker += str.charAt(i);
      }
      return str.equals(checker);
    }

    //9.4
    public static int findGCD(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
    }

    //9.5
    public static void printArray(int[] array) {
      System.out.print("intArray: ");
      for (int value : array) {
          System.out.print(value + " ");
      }
      System.out.println();
    }

    // Перегруженный метод для double[]
    public static void printArray(double[] array) {
      System.out.print("doubleArray: ");
      for (double value : array) {
          System.out.print(value + " ");
      }
      System.out.println();
    }

    // Перегруженный метод для char[]
    public static void printArray(char[] array) {
      System.out.print("charArray: ");
      for (char value : array) {
          System.out.print(value + " ");
      }
      System.out.println();
    }

    //9.6
    public static int getDaysInMonth(int month, int year) {
      if (month < 1 || month > 12) {
          throw new IllegalArgumentException("Invalid month. Month should be between 1 and 12.");
      }
      if (year <= 0) {
          throw new IllegalArgumentException("Invalid year. Year should be a positive number.");
      }
      int[] daysInMonthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      if (isLeapYear(year)) {
          daysInMonthArray[1] = 29;
      }
      return daysInMonthArray[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //9.7
    public static double calculateDistance(int x1, int y1, int x2, int y2){
      double distance = 0;
      distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      return distance;
    }


    //10 доп задача
    //10.1
    public static int writeIncrease(int current, int N){
      if(current < N){
        System.out.print(current + " ");
        return writeIncrease(current + 1, N);
      } else{
        return N;
      }
    }

    //10.2
    public static int fibonacci(int n) {
      if (n <= 1) {
          return n;
      } else {
          return fibonacci(n - 1) + fibonacci(n - 2);
      }
    }

    //10.3
    public static int returnDegree(int num, int degree){
      if(degree >= 1){
        return num * returnDegree(num, degree - 1);
      } else{
        return 1;
      }
    }

    //10.4
    public static int findMaxElement(int[] array, int startIndex, int endIndex) {
      if (startIndex == endIndex) {
          return array[startIndex];
      }
      int midIndex = (startIndex + endIndex) / 2;
      int maxLeft = findMaxElement(array, startIndex, midIndex);
      int maxRight = findMaxElement(array, midIndex + 1, endIndex);
      return Math.max(maxLeft, maxRight);
    }

    //10.5
    public static int findSumOfArray(int[] arr, int position){
      if(position != arr.length){
        return arr[position] + findSumOfArray(arr, position + 1);
      }else{
        return 0;
      }
    }

}