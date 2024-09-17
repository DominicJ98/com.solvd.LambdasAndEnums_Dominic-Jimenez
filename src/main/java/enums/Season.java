package enums;

public enum Season {
    WINTER("Cold"),
    SPRING("Mild"),
    SUMMER("Hot"),
    FALL("Cool");

    private String temperature;

    Season(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
