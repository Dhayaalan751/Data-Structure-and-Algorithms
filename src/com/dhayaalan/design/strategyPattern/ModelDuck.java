package design.strategyPattern;

public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a real Model design.strategyPattern.Duck");
    }
}
