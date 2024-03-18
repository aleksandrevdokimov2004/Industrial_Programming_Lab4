package Transport;

import java.util.Comparator;

public class LevelComparator implements Comparator<Carriage> {

    @Override
    public int compare(Carriage a, Carriage b) {

        int aValue=-1;
        int bValue=-1;
        if (a instanceof PassengerCarriage)
            aValue = ((PassengerCarriage)a).getComfortLevel().ordinal();

        if (b instanceof PassengerCarriage)
                bValue = ((PassengerCarriage)b).getComfortLevel().ordinal();

        return aValue - bValue;
    }
}