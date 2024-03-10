package Animal;

public class Puppy extends Dog {
    public Puppy(String name){
        super(name);
    }

    public Puppy(){
        super();
    }

    @Override
    public void speak(){
        System.out.printf("Щенок %s тихо лает\n", name);
    }

    @Override
    public void jump(){
        System.out.printf("Щенок %s прыгает как может\n", name);
    }

    @Override
    public void run(){
        System.out.printf("Щенок %s медленно бежит\n", name);
    }

    @Override
    public void bite(){
        System.out.printf("Щенок %s пытается укусить\n", name);
    }

    @Override
    public String toString(){
        return String.format("Это щенок %s", name);
    }
}
