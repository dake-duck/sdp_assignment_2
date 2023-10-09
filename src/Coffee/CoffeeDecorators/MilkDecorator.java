package Coffee.CoffeeDecorators;

import Coffee.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee, "Milk", 1.0);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + description;
    }
}