package Animal;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public Animal(){
        name="";
    }

    public abstract void speak();

    public abstract void jump();

    public abstract void run();

    public abstract void bite();

    public abstract String toString();
    public void printName(){
        System.out.printf("Имя: %s\n", name);
    }

    public boolean equals(Animal animal) {
        return this.name.equals(animal.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}
