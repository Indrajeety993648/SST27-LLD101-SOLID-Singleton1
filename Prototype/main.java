package Prototype;

public class main {
    public static void main(String[] args) {
        IFlyable b3 = new crow("Crow");
        b3.fly();

        IEatable b4 = new crow("Crow");
        b4.eat();

        IFlyable b1 = new Pigeon("Pigeon");
        b1.fly();
        IEatable b2 = new Pigeon("Pigeon");
        b2.eat();
        IEatable b0 = new Penguin("Penguin");
        b0.eat();
    }
}
