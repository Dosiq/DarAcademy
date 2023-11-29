package HW_9;

import java.util.Scanner;

public class Square {
    Scanner sc;

    public Square() {
        this.sc = new Scanner(System.in);
    }

    public double returnPerimeter (){
        return 4 * sc.nextInt();
    }

    public double returnArea(){
        return Math.pow(sc.nextInt(), 2);
    }

    public double returnDiagonal(){
        return Math.sqrt(2) * sc.nextInt();
    }
}

