package Transport;

class HeadCarriage extends Carriage {
    public HeadCarriage(int crewCount){
        super(crewCount);
    }
    public HeadCarriage(){ super(); }

    @Override
    public String toString(){
        return String.format("Ведущий вагон: экипаж %d", crewCount);
    }
}
