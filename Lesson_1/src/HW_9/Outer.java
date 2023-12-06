package HW_9;

class Outer {
    private int number;

    public Outer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public class Inner {
        public void incrementAndDisplay() {
            number++;
            System.out.println("Inner incremented number: " + number);
        }
    }
}
