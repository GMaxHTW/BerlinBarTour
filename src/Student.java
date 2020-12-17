/**
 * Methode rank Bar --> Studenten
 * Warst du schon in der Bar? --> Nur dann bewerten
 * Wird in Klasse Bewertung anonym gespeichert
 * (I) rank bar -> Studenten
 * (II) GetBarRanking -> In der Klasse Ranking
 *
 */


public class Student {

    // Attribute die das Objekt Student haben kann
    // final Attribute nach instanziierung (in Main Methode) nicht mehr veränderbar
    private final String lastName;
    private final String firstName;
    private final int yearOfBirth;


    // Veränderbare Attribute des Studenten
    // private Adress adress;
    private double money = 50;
    private boolean drunk = false;
    private boolean broke = false;

    Bar Bar;
    Drink Drink;


    // Konstrukor --> Vorlage zum Erzeugen von nem Objekt Student
    public Student (String firstName, String lastName, int yearOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
    }


    public void introduceYourself () {
        System.out.println("\nHallo ich bin " + firstName
                + "\nFreut mich heute bei der Tour dabei zu sein");
    }


    public void printStudentData () {
        System.out.println("\nName: " + firstName + " " + lastName +
                "\nMomentaner Kassenschnitt: " + money +
                "\nBetrunken: " + drunk + "\nBroke: " + broke);
    }

    public void getRandomDrink () {
        Drink randomDrink = Drink.createRandomDrink();
        //this.Drink = Drink.createRandomDrink();
        this.money = money - randomDrink.getPrice();
        System.out.println("\n" + this.getFirstName() + ": Cool jetzt gibt es was zu Trinken.\nDrink: " +
                randomDrink.getName() +".\nPreis: " + randomDrink.getPrice() + "€" +
                "\nVerfügbares geld: " + money + "€");
    }



    // Getters und Setters
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isDrunk() {
        return drunk;
    }

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }

    public boolean isBroke() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }

    public Bar getBar() {
        return Bar;
    }

    public void setBar(Bar bar) {
        Bar = bar;
    }
}
