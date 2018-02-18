package com.company;


class Hamburger{
    private String name;
    private String rollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean source;
    private int base = 5;
    private int lettucePrice;
    private int tomatoPrice;
    private int carrotPrice;
    private int sourcePrice;
    private int totalPrice=base;

    public Hamburger(String name, String rollType, String meat) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
    }

    public void setLettuce() {
        this.lettuce = true;
        lettucePrice=1;
    }

    public void setTomato() {
        this.tomato = true;
        tomatoPrice=2;
    }

    public void setCarrot() {
        this.carrot = true;
        carrotPrice=3;
    }

    public void setSource() {
        this.source = true;
        sourcePrice=4;
    }

    public int gettotalPrice(){
        return totalPrice;
    }

    public void thePrice(){
        System.out.println("The Base Price "+this.base);
        if (lettuce==true)
            System.out.println("lettuce price: " + lettucePrice);
        if (tomato==true)
            System.out.println("tomato price: " + tomatoPrice);
        if (carrot==true)
            System.out.println("carrot price: " + carrotPrice);
        if (source==true)
            System.out.println("source price: " + sourcePrice);
        System.out.println("The total price"+totalPrice);
    }

}

class HealthyBurger extends Hamburger{
    private boolean apple;
    private boolean peal;


    public void setApple() {
        this.apple = true;
    }

    public void setPeal() {
        this.peal = true;
    }

    public HealthyBurger(String meat,) {
        super("Healthy", "brownRye", meat);

    }



    @Override
    public void thePrice() {
        super.thePrice();

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
