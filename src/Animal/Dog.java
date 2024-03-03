package Animal;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public Dog(){
        super();
    }

    @Override
    public void speak(){
        System.out.printf("Собака %s громко гавкает\n", name);
    }

    @Override
    public void jump(){ System.out.printf("Собака %s высоко прыгает\n", name); }

    @Override
    public void run(){
        System.out.printf("Собака %s быстро бежит\n", name);
    }

    @Override
    public void bite(){
        System.out.printf("Собака %s сильно кусает\n", name);
    }

    @Override
    public String toString(){
        return name.isEmpty()?"Это собака":String.format("Это собака %s", name);
    }
}
