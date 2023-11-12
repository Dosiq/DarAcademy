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


}