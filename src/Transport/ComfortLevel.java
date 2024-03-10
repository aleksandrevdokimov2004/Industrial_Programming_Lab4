package Transport;

public enum ComfortLevel {
    LOW("Плацкарт", 0),
    MEDIUM("СВ-вагон", 1),
    HIGH("Купе", 2);

    private final String name;
    private final int level;

    ComfortLevel(String name, int level) {
        this.name = name;
        this.level=level;
    }

    public static ComfortLevel fromInteger(int x) {
        return switch (x) {
            case 0 -> LOW;
            case 1 -> MEDIUM;
            case 2 -> HIGH;
            default -> null;
        };
    }

    public String toString() {
        return this.name;
    }

    public int getComfortInt(){
        return level;
    }
}