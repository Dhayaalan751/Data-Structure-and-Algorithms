package design.strategyPattern;

public interface FlyBehaviour {
    void fly();
}

class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}

class FlyRocketPowered implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}