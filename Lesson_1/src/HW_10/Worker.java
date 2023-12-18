package HW_10;

public class Worker extends Person implements Walkable{
    private String position;
    private String level;
    private double salary;

    public Worker(long id, String name, String surname, int age, String position, String level, double salary) {
        super(id, name, surname, age);
        this.position = position;
        this.level = level;
        this.salary = salary;
    }

    @Override
    public double walk() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Worker{" +
                "position='" + position + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
}
