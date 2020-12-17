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
    private boolean broke = false;

    Bar Bar;


    // Konstrukor --> Vorlage zum Erzeugen von nem Objekt Student
    public Student (String firstName, String lastName, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }


    public void introduceYourself () {
        System.out.println("\nHallo ich bin " + firstName
                + "\nFreut mich euch kennen zu lernnen");
    }


    public void goToRandomBar() {
        this.Bar = Bar.createRandomBar();
    }


}
