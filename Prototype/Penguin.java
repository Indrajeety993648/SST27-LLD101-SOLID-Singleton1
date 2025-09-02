package Prototype;

public class Penguin extends bird implements IEatable {
    public Penguin(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

}
