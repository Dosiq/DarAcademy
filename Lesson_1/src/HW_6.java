import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_6 {
    public static void main(String[] args) {
        //1
        int[] arr1 = {1, 3, 4, 1, 5, 5};
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum/ arr1.length);

        //2
        List list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if(arr1[i] == arr1[j] && i != j) {
                    list.add(arr1[j]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();

        //3.1 3.2 target = 23
        int[] arr2 = {1, 3, -6, 23, 14, 2};
        boolean ans = false;
        int target = 23;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == target){
                ans = true;
                break;
            }
        }
        System.out.println(ans);

        //4 target = 23 (-1 no)
        int target1 = 23;
        int ans1 = -1;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == target1){
                ans1 = i;
                break;
            }
        }
        System.out.println(ans1);

        //5 n=3 m=8
        int[] arr3 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        int ansArrLength = m - n + 1;
        int[] ansArr = new int[ansArrLength];
        int iter = 0;
        for (int i = 0; i < arr3.length; i++) {
            if(i >= n){
                ansArr[iter] = arr3[i];
                iter++;
                if(i == m)
                    break;
            }
        }
        for (int i = 0; i < ansArr.length; i++) {
            System.out.print(ansArr[i] + ", ");
        }
        System.out.println();

        //6
        int[] arr4 = {1, 3, -6, 23, 14, 2};
        int min = arr4[0];
        int max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] > max)
                max = arr4[i];
            if(arr4[i] < min)
                min = arr4[i];
        }
        System.out.println("Min= " + min + ", Max= " + max);

        //7
        int[] arr5 = {1, 3, -6, 23, 14, 2};
        int min1 = arr5[0];
        int min2 = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] < min1)
                min1 = arr5[i];
        }
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] < min2 && arr5[i] != min1)
                min2 = arr5[i];
        }
        System.out.println("First min= " + min1 + ", Second min=" + min2);

        //8
        int[] array = {1, 2, 3, 0, 4, 6};
        String ans5 = "";
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            ans5 += array[i];
        }
        System.out.println(ans5);

        //9
        int[][] array1 = {
                {10,20,30},
                {40,50,60}
        };
        int[][] newArray = new int[array1[0].length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                newArray[j][i] = array1[i][j];
            }
        }

        for (int i = 0; i < array1[0].length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

        //10
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                sum2 += array1[i][j];
            }
        }
        System.out.println(sum2);

        //11
        int[][] array3 = {
                {10,20},
                {40,50}
        };
        if(array3.length == array3[0].length)
            System.out.println(true);
        else
            System.out.println(false);

        //12
        int n1 = 5; // Заданное число n
        int[][] multiplicationTable = new int[n1][n1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(multiplicationTable[i][j] + " ");
            }
            System.out.println();
        }

        //13
        int[][] array4 = {
                {10,20,30},
                {40,50,60}
        };
        int minArray = array4[0][0];
        int maxArray = array4[0][0];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[0].length; j++) {
                if(minArray > array4[i][j])
                    minArray = array4[i][j];
                if(maxArray < array4[i][j])
                    maxArray = array4[i][j];
            }
        }
        System.out.println("Min= " + minArray + ", Max= " + maxArray);



    }
}
