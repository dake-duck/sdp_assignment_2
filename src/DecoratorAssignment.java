import java.util.ArrayList;
import java.util.List;

import Coffee.Coffee;
import Coffee.Espresso;
import Coffee.Latte;
import Coffee.CoffeeDecorators.MilkDecorator;
import Coffee.CoffeeDecorators.SugarDecorator;


public class DecoratorAssignment {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee latte = new Latte();

        espresso = new MilkDecorator(espresso);
        espresso = new SugarDecorator(espresso);

        latte = new MilkDecorator(latte);

        List<Coffee> orders = new ArrayList<>();
        orders.add(espresso);
        orders.add(latte);

        for (Coffee order : orders) {
            System.out.println("Order: " + order.getDescription());
            System.out.println("Cost: $" + order.cost());
            System.out.println();
        }
    }
}
