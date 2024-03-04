package Transport;
import java.util.*;

public class TrainGenerator {

    private ArrayList<Carriage> train;

    TrainGenerator(int count){
        Random rd = new Random();
        train = new ArrayList<>();
        train.add(new HeadCarriage(10));
        for(int i =1; i<count; i++)
            if(i%3==0) train.add(new RestaurantCarriage(5));
            else {
                int countedPassengers = rd.nextInt(10,30);
                int countedLuggage = countedPassengers * rd.nextInt(1,3);
                train.add(new PassengerCarriage(rd.nextInt(1,3),
                        ComfortLevel.fromInteger(rd.nextInt(0,3)), countedPassengers, countedLuggage));
            }
    }

    public ArrayList<Carriage> getTrain(){
        return train;
    }

    public int getOverallPassengersCount(){
        int overallPassengersCount = 0;
        for(Carriage each :train){
            if(each instanceof PassengerCarriage){
                overallPassengersCount+=((PassengerCarriage) each).getPassengersCount();
            }
        }
        return overallPassengersCount;
    }

    public int getOverallLuggageCount(){
        int overallLuggageCount = 0;
        for(Carriage each :train)
            if(each instanceof PassengerCarriage)
                overallLuggageCount+=((PassengerCarriage) each).getLuggageCount();

        return overallLuggageCount;
    }

    public ArrayList<Carriage> getCarriageWithPassengersBetween(int min, int max) {
        ArrayList<Carriage> carriages = new ArrayList<>();
        for (Carriage each :train) {
            if (!(each instanceof PassengerCarriage)) continue;

            if( ((PassengerCarriage) each).getPassengersCount() >= min &&
                    ((PassengerCarriage) each).getPassengersCount() <= max )
                    carriages.add(each);
        }
        return carriages;
    }

    public ArrayList<Carriage> getTrainsSortedByComfort() {

        ArrayList<Carriage> sorted = (ArrayList<Carriage>)train.clone();
        LevelComparator levelComparator = new LevelComparator();
        sorted.sort(levelComparator);

        return sorted;
    }
}