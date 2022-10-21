package Services;


import Manav.Apple;

public interface AppleService extends FruitService<Apple>{

    void add(double kilo);
    void buy(double kilogram);
    }

