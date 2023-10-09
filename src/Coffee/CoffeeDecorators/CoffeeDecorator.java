package Coffee.CoffeeDecorators;

import Coffee.Coffee;

abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee, String description, double cost) {
        super(description, coffee.cost + cost);
        this.coffee = coffee;
    }
}
