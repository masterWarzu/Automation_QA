import ru.praktikum.model.*;
import ru.praktikum.model.constants.*;
import ru.praktikum.model.service.ShoppingCart;

public class Main
{
    public static void main(String[] args)
    {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED_COLOUR);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_COLOUR);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров: " + shoppingCart.allSum(foods) + " р.");

        System.out.println("Сумма товаров со скидкой: " + shoppingCart.discountSum(foods) + " р.");

        System.out.println("Сумма всех вегетарианских продуктов: " + shoppingCart.vegetarianSum(foods));
    }
}