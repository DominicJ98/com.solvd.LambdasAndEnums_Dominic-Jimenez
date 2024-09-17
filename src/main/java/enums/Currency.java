package enums;

public enum Currency {
    USD("United States Dollar"),
    EUR("Euro"),
    JPY("Japanese Yen");

    private String fullName;

    Currency(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void printCurrencyDetails() {
        System.out.println(this.name() + ": " + fullName);
    }
}
