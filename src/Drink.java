public class Drink {

    private double price;
    private String name;

    private static String [] drinkName = new String[] {"Beer", "Water", "Cola", "Cuba Libre", "Moscow Mule", "Gin Tonic"};


    public Drink (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getRandomDrinkName () {
        return drinkName[(int) (drinkName.length * Math.random())];
    }

    public double getRandomDrinkPrice () {
        double drinkPrice = 2.5;

        double chance = Math.random();

        if (chance < 0.1) {
            System.out.println("Der Drink geht heute mal aufs Haus!");
            drinkPrice = 0;
        } else if (chance < 0.2) {
            System.out.println("Den drink bekommste für die Hälfte");
            drinkPrice = drinkPrice/2;
        }
        return drinkPrice;
    }

    public Drink createRandomDrink() {
        String name = getRandomDrinkName();
        double price = getRandomDrinkPrice();

        System.out.println("\nHier dein " + name + "." + "Lass es dir schmecken!"+
                "\nDas macht dann " + price + " €. ");

        return new Drink(name, price);
    }

}
