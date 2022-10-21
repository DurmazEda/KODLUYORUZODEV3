package Services;

public interface FruitService<Fruit> {
    Fruit add(Fruit fruit);
    void buy(double kilogram);
}
