package enums;

public enum Day {
    MONDAY("Workday"),
    TUESDAY("Workday"),
    WEDNESDAY("Workday"),
    THURSDAY("Workday"),
    FRIDAY("Workday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private String type;

    Day(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }
}
