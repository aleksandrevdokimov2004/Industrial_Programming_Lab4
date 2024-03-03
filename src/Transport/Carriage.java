package Transport;

public class Carriage {
    protected int crewCount;

    public Carriage(int crewCount){
        this.crewCount=crewCount;
    }

    public Carriage(){
        this.crewCount=0;
    }

    public int getCrewCount(){
        return crewCount;
    }

    public String toString(){
        return String.format("Вагон общего назначения: экипаж %d", crewCount);
    }
}