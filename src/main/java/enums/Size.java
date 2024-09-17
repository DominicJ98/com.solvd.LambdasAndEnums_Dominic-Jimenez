package enums;

public enum Size {
    SMALL(10), MEDIUM(20), LARGE(30);

    private int volume;

    Size(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
}
