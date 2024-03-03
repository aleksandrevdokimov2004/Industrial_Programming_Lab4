package Transport;

class RestaurantCarriage extends Carriage {
    public RestaurantCarriage(int crewCount){
        super(crewCount);
    }
    public RestaurantCarriage(){
        super();
    }

    @Override
    public String toString(){
        return String.format("Вагон-ресторан: экипаж %d", crewCount);
    }
}
