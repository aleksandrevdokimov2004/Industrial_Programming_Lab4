package Transport;

class PassengerCarriage extends Carriage{
    private ComfortLevel comfortLevel;
    private int passengersCount;
    private int luggageCount;

    public PassengerCarriage(int crewCount, ComfortLevel comfortLevel , int passengersCount, int luggageCount){
        super(crewCount);
        this.comfortLevel=comfortLevel;
        this.passengersCount=passengersCount;
        this.luggageCount=luggageCount;
    }

    public PassengerCarriage(){
        super();
        this.comfortLevel=ComfortLevel.LOW;
        this.passengersCount=0;
        this.luggageCount=0;
    }

    @Override
    public String toString(){
        return String.format("Пассажирский вагон: экипаж %d\tУровень комфорта: %s\tПассажиры: %d\t" +
                "Багаж: %d", crewCount, comfortLevel.toString(), passengersCount, luggageCount);
    }

    public ComfortLevel getComfortLevel(){
        return comfortLevel;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public int getLuggageCount() {
        return luggageCount;
    }
}
