package Transport;

class PassengerCarriage extends Carriage{
    private int comfortLevel;
    private int passengersCount;
    private int luggageCount;

    public PassengerCarriage(int crewCount, int comfortLevel, int passengersCount, int luggageCount){
        super(crewCount);
        this.comfortLevel=comfortLevel;
        this.passengersCount=passengersCount;
        this.luggageCount=luggageCount;
    }

    public PassengerCarriage(){
        super();
        this.comfortLevel=0;
        this.passengersCount=0;
        this.luggageCount=0;
    }

    @Override
    public String toString(){
        return String.format("Пассажирский вагон: экипаж %d\tУровень комфорта: %d\tПассажиры: %d\t" +
                "Багаж: %d", crewCount, comfortLevel, passengersCount, luggageCount);
    }

    public int getComfortLevel(){
        return comfortLevel;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public int getLuggageCount() {
        return luggageCount;
    }
}
