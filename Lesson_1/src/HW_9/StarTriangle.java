package HW_9;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < width + 1; i++) {
            for (int j = 0; j < i; j++) {
                str.append("*");
            }
            str.append("\n");
        }

        return str.toString();
    }
}
