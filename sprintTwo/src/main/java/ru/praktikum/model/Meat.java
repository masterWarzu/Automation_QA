package ru.praktikum.model;

public class Meat extends Food
{
    public Meat(int amount, double price)
    {
        super(amount, price);
        isVegetarian = false;
    }

    @Override
    public double getDiscount()
    {
        return 0;
    }

    public boolean Vegetarian()
    {
        return isVegetarian;
    }
}