package HW_8;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //1
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Мусагалиев", "Коктем-1", 25);
        Student student3 = new Student("Кристина", "Попова", "Коктем-3", 26);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3 + "\n");

        //2
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare() + "\n");

        //3
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println(rectangle1.returnArea());
        System.out.println(rectangle2.returnArea() + "\n");

        //4
        Average average = new Average();
        System.out.println(average.calculateAverage(10, 15, 43) + "\n");


        //5
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println("Информация о фильме 1:");
        movie1.displayMovieInfo();
        System.out.println("Информация о фильме 2:");
        movie2.displayMovieInfo();
        System.out.println();


        //6
    }
}
