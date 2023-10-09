package Coffee.CoffeeDecorators;

import Coffee.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee, "Sugar", 0.5);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + description;
    }
}
