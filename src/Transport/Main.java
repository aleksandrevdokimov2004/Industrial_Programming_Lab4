package Transport;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        TrainGenerator trainGen = new TrainGenerator(10);
        boolean isWorking = true;
        int code = 0;
        while(isWorking){
            System.out.print("Вывод информации о поезде:\n" +
                    "0 - код вывода количества всех пасажиров в поезде\n" +
                    "1 - код вывода количества всего багажа в поезде\n" +
                    "2 - код вывода вагонов с пассажирами в диапозоне\n" +
                    "3 - код вывода вагонов, отсортированных по уровню комфорта\n" +
                    "4 - код вывода всех вагонов\n" +
                    "другой код - код выхода\nКод:");
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
                    System.out.printf("Пассажирские вагоны с %d-%d пассажирами\n", minPass, maxPass);
                    TrainGenerator.print(trainGen.getCarriageWithPassengersBetween(minPass, maxPass));
                    break;
                case 3:
                    System.out.println("Вагоны, отсортированные по уровню комфорта");
                    TrainGenerator.print(trainGen.getTrainsSortedByComfort());
                    break;
                case 4:
                    trainGen.printAll();
                    break;
                default:
                    System.out.println("Выход из программы");
                    isWorking=false;
                    break;
            }
        }
        in.close();
    }
}