package Transport;

public enum MenuItems {

    PRINT_ALL_PASSENGERS,
    PRINT_ALL_LUGGAGE,
    PRINT_CARRIAGE_IN_RANGE,
    PRINT_SORTED_BY_COMFORT,
    PRINT_ALL_CARRIAGES,
    EXIT;

    public static MenuItems findItemFromString(String input){
        return switch (input){
            case "PP" -> PRINT_ALL_PASSENGERS;
            case "PL" -> PRINT_ALL_LUGGAGE;
            case "PR" -> PRINT_CARRIAGE_IN_RANGE;
            case "PS" -> PRINT_SORTED_BY_COMFORT;
            case "PA" -> PRINT_ALL_CARRIAGES;
            default -> EXIT;
        };
    }
}