package Transport;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static <T> void print(ArrayList<T> list){
        for(T each : list)
            System.out.println(each);
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        TrainGenerator trainGen = new TrainGenerator(10);

        MenuItems menuCommand = MenuItems.PRINT_ALL_CARRIAGES;
        String command;

        while(menuCommand!=MenuItems.EXIT){
            System.out.print("""
                    Вывод информации о поезде:
                    PP - код вывода количества всех пасажиров в поезде
                    PL - код вывода количества всего багажа в поезде
                    PR - код вывода вагонов с пассажирами в диапозоне
                    PS - код вывода вагонов, отсортированных по уровню комфорта
                    PA - код вывода всех вагонов
                    другой код - код выхода
                    Код:""");
            command = in.nextLine().toUpperCase();
            menuCommand = MenuItems.findItemFromString(command);
            switch (menuCommand){
                case PRINT_ALL_PASSENGERS:
                    System.out.printf("Всего пассажиров в поезде: %d\n", trainGen.getOverallPassengersCount());
                    break;
                case PRINT_ALL_LUGGAGE:
                    System.out.printf("Всего багажа в поезде: %d\n", trainGen.getOverallLuggageCount());
                    break;
                case PRINT_CARRIAGE_IN_RANGE:
                    System.out.println("Введите минимальное количество пассажиров");
                    int minPass = in.nextInt();
                    System.out.println("Введите максимальное количество пассажиров");
                    int maxPass = in.nextInt();
                    ArrayList<Carriage> found = trainGen.getCarriageWithPassengersBetween(minPass, maxPass);
                    if(found.isEmpty()) {
                        System.out.println("Ничего не найдено");
                        break;
                    }
                    System.out.printf("Пассажирские вагоны с %d-%d пассажирами\n", minPass, maxPass);
                    ArrayList<Carriage> carriagesWithPassengers =
                            trainGen.getCarriageWithPassengersBetween(minPass, maxPass);
                    print(carriagesWithPassengers);
                    in.nextLine();
                    break;
                case PRINT_SORTED_BY_COMFORT:
                    System.out.println("Вагоны, отсортированные по уровню комфорта");
                    ArrayList<Carriage> sorted = trainGen.getTrainsSortedByComfort();
                    print(sorted);
                    break;
                case PRINT_ALL_CARRIAGES:
                    print(trainGen.getTrain());
                    break;
                case EXIT:
                    System.out.print("Выход из программы");
                    break;
            }
        }
        in.close();
    }
}