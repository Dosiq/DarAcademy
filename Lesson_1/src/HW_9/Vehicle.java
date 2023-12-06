package HW_9;

class Vehicle {
    private int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public class Engine implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                speed += 10;
                System.out.println("Engine is running. Speed: " + speed);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void startEngine() {
        Engine engine = new Engine();
        Thread engineThread = new Thread(engine);
        engineThread.start();
    }
}
