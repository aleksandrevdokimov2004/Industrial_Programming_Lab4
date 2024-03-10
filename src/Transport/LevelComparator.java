package Transport;

import java.util.Comparator;

public class LevelComparator implements Comparator<Carriage> {

    @Override
    public int compare(Carriage a, Carriage b) {
        int aValue = (a instanceof PassengerCarriage)?
                ((PassengerCarriage)a).getComfortLevel().getComfortInt():-1;
        int bValue = (b instanceof PassengerCarriage)?
                ((PassengerCarriage)b).getComfortLevel().getComfortInt():-1;
        return aValue - bValue;
    }
}