package Transport;

import java.util.Comparator;

public class LevelComparator implements Comparator<Carriage> {

    @Override
    public int compare(Carriage a, Carriage b) {

        int aValue, bValue;
        if (a instanceof PassengerCarriage)
        aValue = ((PassengerCarriage)a).getComfortLevel().ordinal();
        else aValue = -1;

        if (b instanceof PassengerCarriage)
                bValue = ((PassengerCarriage)b).getComfortLevel().ordinal();
        else bValue = -1;
        return aValue - bValue;
    }
}