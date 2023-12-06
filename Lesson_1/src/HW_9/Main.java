package HW_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Student student1 = new Student("Иван", 12345);

        System.out.println("Имя: " + student1.getName());
        System.out.println("ID: " + student1.getId());
        System.out.println("Год обучения: " + student1.getYearOfStudy());

        student1.increaseYearOfStudy();
        System.out.println("Год обучения после увеличения: " + student1.getYearOfStudy());

        //2
        StarTriangle starTriangle = new StarTriangle(3);
        System.out.println(starTriangle.toString());

        //3

        Square sq = new Square();
        System.out.print("Enter width: ");
        System.out.println(sq.returnPerimeter());
        System.out.print("Enter width: ");
        System.out.println(sq.returnArea());
        System.out.print("Enter width: ");
        System.out.println(sq.returnDiagonal());

        //4
        Temperature temp1 = new Temperature(25, 'C');
        System.out.println("Температура в градусах Цельсия: " + temp1.getTemperatureCelsius());
        System.out.println("Температура в градусах Фаренгейта: " + temp1.getTemperatureFahrenheit());
        System.out.println("Шкала: " + temp1.getScale());

        Temperature temp2 = new Temperature(98.6, 'F');
        System.out.println("\nТемпература в градусах Цельсия: " + temp2.getTemperatureCelsius());
        System.out.println("Температура в градусах Фаренгейта: " + temp2.getTemperatureFahrenheit());
        System.out.println("Шкала: " + temp2.getScale());



        //9.2.1
        Outer outer = new Outer(1);
        Outer.Inner inner = outer.new Inner();
        inner.incrementAndDisplay();


        //9.2.2
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        //9.2.3
        Book book = new Book("Vinland Saga");
        Book.Description description = book.new Description();
        description.displayBookInfo();
    }
}
