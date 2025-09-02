package Prototype;

public class sparrow extends bird implements IFlyable, IEatable {
    public sparrow(String name) {
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
