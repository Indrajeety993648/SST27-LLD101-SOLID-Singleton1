package Prototype;

public class crow extends bird implements IFlyable, IEatable, IClonable {
    public crow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public IClonable clone() {
        return new crow(name);
    }

    // @Override
    // public void eat() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'eat'");
    // }

    // @Override
    // public void fly() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'fly'");
    // }

}
