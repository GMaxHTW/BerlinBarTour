public class Main {

    public static void main (String[] args) {


        // Objekte vom Typ Studenten erzeugt
        Student student1 = new Student("Johannes", "Heilemann", "07.07.1994");
        Student student2= new Student("Max", "Gäble", "12.09.1996");
        Student student3 = new Student("Koni", "Klein", "07.07.1994");
        Student student4 = new Student("Alex", "Gschweng", "07.07.1994");
        Student student5 = new Student("Brandon", "Drew", "07.07.1994");
        Student nikolaus = new Student("Nikolaus", "Der Knecht vom Weihnachtsmann", "24.12.245");

        // Methode introduce yourself --> Stellt sich Objekt Student vor
        student1.introduceYourself();
        student2.introduceYourself();


        student1.drinkBeer();
        student2.drinkBeer();







    }
}
