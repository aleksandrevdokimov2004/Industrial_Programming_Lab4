package Animal;

public class Main {
    public static void main(String[] args) {
        Animal puppy = new Puppy("Ник");
        Animal puppy2 = new Puppy("Джек");
        puppy.jump();
        Animal doggy = new Dog("Стрелка");
        doggy.jump();
        System.out.printf(puppy.equals(puppy2)?"Щенки одинаковы":"Щенки разные" + "\n");
        puppy2.printName();
    }
}