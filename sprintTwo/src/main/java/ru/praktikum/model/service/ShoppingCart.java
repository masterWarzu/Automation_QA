package ru.praktikum.model.service;
import ru.praktikum.model.*;

public class ShoppingCart
{
    private Food[] foods;
    public ShoppingCart(Food[] foods)
    {
        this.foods = foods;
    }

    public double allSum(Food[] foods)
    {
        double allSum = 0;
        for (Food food : foods)
        {
            allSum += food.getAmount() * food.getPrice();
        }
        return allSum;
    }

    public double discountSum(Food[] foods)
    {
        double discSum = 0;
        for (Food food : foods)
        {
            discSum += (food.getAmount() * food.getPrice()) / 100 * food.getDiscount();
        }
        return allSum(foods) - discSum;
    }

    public double vegetarianSum(Food[] foods)
    {
        double veganSum = 0;
        for (Food food : foods)
        {
            if (food.Vegetarian())
            {
                veganSum += food.getAmount() * food.getPrice();
            }
        }
        return veganSum;
    }
}