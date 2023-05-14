package ru.praktikum.model;

public abstract class Food implements Discountable
{
    private int amount;   // количество продукта
    private double price; // цена за единицу продукта
    protected boolean isVegetarian; // флаг на вегетарианство

    public int getAmount()
    {
        return amount;
    }

    public double getPrice()
    {
        return price;
    }

    public Food(int amount, double price)
    {
        this.amount = amount;
        this.price = price;
    }

    protected String colour;
    public Food(int amount, double price, String colour)
    {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    public abstract double getDiscount();

    public abstract boolean Vegetarian();
}