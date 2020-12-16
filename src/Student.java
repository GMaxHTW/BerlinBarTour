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
    private final String dateOfBirth;

    // Veränderbare Attribute des Studenten
    // private Adress adress;
    private double money = 50;
    private boolean drunk = false;

    // Konstrukor --> Vorlage zum Erzeugen von nem Objekt Student
    public Student (String firstName, String lastName, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }


    public void introduceYourself () {
        System.out.println("\nHallo ich bin der " + firstName
                + "\nFreut mich euch kennen zu lernnen");
    }


    /**
     * Die Methode earnMoney
     * Zufallszahl zwischen
     */
    public void earnMoney () {
        System.out.println(firstName + " geht arbeiten im Berghain");
        money = money + 40;
    }

    /**
     * Methode zum senden von Geld
     *
     * Beispiel student --> sendet Geld an studentReceivingMoney
     * @param studentReceivingMoney
     */
    public void sendMoney (int moneyToSend, Student studentReceivingMoney) {
        money = money - moneyToSend;
        studentReceivingMoney.money = studentReceivingMoney.money + moneyToSend;
        System.out.println("\n" + this.firstName + "Neuer Geldbestand " + this.money +
                "\n" + studentReceivingMoney.firstName + " Neuer Geldbestand " + studentReceivingMoney.money);
    }



    /**
     * Der Student geht mit seinen Freunden Party machen
     * In der Location trinkt man auf jeden Fall erstmal ein Bier oder einer Wasser
     * Jeder so wie er das will aber das kostet dann erstmal 2,50 €
     *
     * Mit einer Wahrscheinlichkeit von 40% holt man sich dire
     * */
    public void drinkBeer () {
        double beerPrice = 2.5;
        money = money - beerPrice;
        System.out.println("\n" + firstName + " trinkt genüsslich sein Bier" +
                "\nMomentaner Kassenschnitt " + money  +"€");
    }

    public void drinkShot () {
        double beerPrice = 2.5;
        money = money - beerPrice;
        System.out.println("\n" + firstName + " trinkt genüsslich sein Bier" +
                "\nMomentaner Kassenschnitt " + money  +"€");
    }

    public void drinkWater () {
        double beerPrice = 2.5;
        money = money - beerPrice;
        System.out.println("\n" + firstName + " trinkt genüsslich sein Bier" +
                "\nMomentaner Kassenschnitt " + money  +"€");
    }

    public void chooseRandomBar() {

    }

    public void chooseRandomClub () {

    }

}
