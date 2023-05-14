package ru.praktikum.model;
import ru.praktikum.model.constants.Discount;

public class Apple extends Food
{
    public Apple(int amount, double price, String colour)
    {
        super(amount, price, colour);
        isVegetarian = true;
    }

    @Override
    public double getDiscount()
    {
        if(colour.equals("red"))
        {
            return Discount.DISCOUNT;
        }
        return 0;
    }

    @Override
    public boolean Vegetarian()
    {
        return isVegetarian;
    }
}