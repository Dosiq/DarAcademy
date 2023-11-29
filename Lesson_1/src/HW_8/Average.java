package HW_8;

public class Average {

    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Нет чисел для вычисления среднего значения.");
            return 0;
        }

        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;
        return  average;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

