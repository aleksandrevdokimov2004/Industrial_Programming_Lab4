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
        boolean isWorking = true;
        int code;
        while(isWorking){
            System.out.print("""
                    Вывод информации о поезде:
                    0 - код вывода количества всех пасажиров в поезде
                    1 - код вывода количества всего багажа в поезде
                    2 - код вывода вагонов с пассажирами в диапозоне
                    3 - код вывода вагонов, отсортированных по уровню комфорта
                    4 - код вывода всех вагонов
                    другой код - код выхода
                    Код:""");
            code = in.nextInt();
            switch (code){
                case 0:
                    System.out.printf("Всего пассажиров в поезде: %d\n", trainGen.getOverallPassengersCount());
                    break;
                case 1:
                    System.out.printf("Всего багажа в поезде: %d\n", trainGen.getOverallLuggageCount());
                    break;
                case 2:
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
                    print(trainGen.getCarriageWithPassengersBetween(minPass, maxPass));
                    break;
                case 3:
                    System.out.println("Вагоны, отсортированные по уровню комфорта");
                    print(trainGen.getTrainsSortedByComfort());
                    break;
                case 4:
                    print(trainGen.getTrain());
                    break;
                default:
                    System.out.print("Выход из программы");
                    isWorking=false;
                    break;
            }
        }
        in.close();
    }
}