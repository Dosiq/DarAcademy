package HW_9;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature(double temperature) {
        this(temperature, 'C');
    }

    public Temperature(char scale) {
        this(0, scale);
    }

    public Temperature() {
        this(0, 'C');
    }

    public double getTemperatureCelsius() {
        if (scale == 'F') {
            return (temperature - 32) * 5 / 9;
        } else {
            return temperature;
        }
    }

    public double getTemperatureFahrenheit() {
        if (scale == 'C') {
            return (temperature * 9 / 5) + 32;
        } else {
            return temperature;
        }
    }

    public char getScale() {
        return scale;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

}

