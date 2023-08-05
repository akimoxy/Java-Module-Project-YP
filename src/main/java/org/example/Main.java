package org.example;
import java.util.Scanner;
class Product
{
    public static String name;
    public static float price = 0.00f;
}
 class CalculateClass
{
    public static   float allPrice ;
    public static float pricePerPerson ;
    public  String rub;
    String ololo(float rubleInc)
    {
        int ruble = (int) Math.floor(rubleInc) ;
         if (ruble >= 5 && ruble <= 20)
        { rub="рублей";
            return rub;
        }
        switch(ruble % 10)
        {
            case 1: rub="рубль";
                break;
            case 2:
            case 3:
            case 4:rub="рубля";
                break;
            default:rub="рублей";
                break;
        }
       return rub;
    }
    public void calculate()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт ?");
    int people = scanner.nextInt();
    while (people <= 1)
    {
            System.out.println("Введите верное колличество гостей (более одного)");
            people = scanner.nextInt();
    if (people > 1)
    {
     break;
    }
    }
    String allProduct = "";
    while(true)
    {
            System.out.println("Введите название товара ");
            Product.name = scanner.next();
    if (Product.name.equalsIgnoreCase("завершить"))
    {           pricePerPerson = allPrice / people;
                ololo(allPrice);
                System.out.println("Добавленные товары:");
                System.out.println(allProduct);
                String productList=String.format("Общий чек %.2f %s",allPrice,rub);
                System.out.println(productList);

                ololo(pricePerPerson);

                String perPerson=String.format("Стоимость %.2f %s",pricePerPerson,rub);
                System.out.println(perPerson);
    break;
    }
      System.out.println("Введите стоимость товара ");
      Product.price = scanner.nextFloat();
    if (Product.price <= 0)
    {
      System.out.println("Введена неверная сумма,повторите ввод\nВведите стоимость товара");
      Product.price = scanner.nextFloat();
    }
       allProduct = allProduct + Product.name + "\n";
    if (Product.price > 0)
    {
       System.out.println(Product.name + "-" + Product.price + "\n" + "Товар успешно добавлен.\nХотите  добавить ещё один товар?Если нет-введите ЗАВЕРШИТЬ");
       allPrice = allPrice + Product.price;
    }
    }}
    }
 public class Main {
    public static void main(String[] args)
     {
        CalculateClass calc= new CalculateClass();
        calc.calculate();

     }
                   }




















