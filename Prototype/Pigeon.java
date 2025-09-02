package Prototype;

public class Pigeon extends bird implements IFlyable, IEatable {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

}
