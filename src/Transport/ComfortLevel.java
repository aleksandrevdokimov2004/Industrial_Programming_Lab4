package Transport;

public enum ComfortLevel {
    LOW("Плацкарт"),
    MEDIUM("СВ-вагон"),
    HIGH("Купе");

    private final String name;

    ComfortLevel(String name) {
        this.name = name;
    }

    public static ComfortLevel fromInteger(int x) {
        if(x>2 || x<0) return null;
        return ComfortLevel.values()[x];
    }

    public String toString() {
        return this.name;
    }
}