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
                        rd.nextInt(0,3), countedPassengers, countedLuggage));
            }
    }

    public void printAll(){
        for(Carriage each : train){
            System.out.println(each);
        }
    }

    public static void print(ArrayList<Carriage> train){
        for(Carriage each : train){
            System.out.println(each);
        }
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

        boolean swapped=true;
        while(swapped) {
            swapped = false;
            for (int j = 0; j < sorted.size() - 1; j++) {
                int comfortCurr = (sorted.get(j) instanceof PassengerCarriage)?((PassengerCarriage)sorted.get(j)).getComfortLevel():-1;
                int comfortNext = (sorted.get(j+1) instanceof PassengerCarriage)?((PassengerCarriage)sorted.get(j+1)).getComfortLevel():-1;
                if (comfortCurr > comfortNext) {
                    Collections.swap(sorted, j, j+1);
                    swapped = true;
                }
            }
        }

        return sorted;
    }

}
