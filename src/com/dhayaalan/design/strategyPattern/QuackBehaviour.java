package com.dhayaalan.design.strategyPattern;

public interface QuackBehaviour {
    void quack();
}

class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("design.strategyPattern.Quack");
    }
}

class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Rubber duck squeak");
    }
}

class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Can't design.strategyPattern.Quack");
    }
}
