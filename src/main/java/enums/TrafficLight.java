package enums;

public enum TrafficLight {
    RED(30), GREEN(60), YELLOW(5);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void printMessage() {
        switch (this) {
            case RED:
                System.out.println("Stop!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
            case YELLOW:
                System.out.println("Caution!");
                break;
        }
    }
}
