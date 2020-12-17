public class TourGuide extends Student{

    // Attribute des Tourguides
    private boolean readyToGo = false;
    private double tipSpended = 0;


    public TourGuide(String firstName, String lastName, String dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    private Student [] partyPeoples = new Student[5];


    /**
     * Methode introduceYourself
     * Beispiel für überschriebene Methode
     */
    public void introduceYourself () {
        System.out.println("\nHallo ich bin " + getFirstName() + " " + getLastName() + " ich bin heute euer Tourguide."
                + "\nFreut mich, dass ihr alle dabei seit!");
    }

    /**
     * Methode printDataPartyPeoples
     * Methode geht über Array partyPeoples und gibt Daten der Studenten aus
     */
    public void printDataPartyPeoples () {
        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] != null) {
                partyPeoples[i].printStudentData();
            }
        }
    }


    public void goToRandomBar() {
        if (readyToGo) {
            this.Bar = Bar.createRandomBar();
        }
    }



    public void addStudentToCrew (Student s) {
        boolean addedToTheCrew = false;

        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] == null) {
                partyPeoples[i] = s;
                addedToTheCrew = true;
                System.out.println("\n" + s.getFirstName()+ " wurde erfolgreich zur Crew hinzugefügt!");
                break;
            }
        }

        if (!addedToTheCrew) {
            System.out.println("\nLeider ist deine Crew schon voll");
        }
    }


    public boolean checkCrewReadyToGo () {
        int counter = 0;
        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] != null) {
                counter++;
            }
        }
        return counter == partyPeoples.length;
    }



    public void organizeTeam () {
        Student s; // s ist hier ein Platzhalter vom Typ Student (wird zum sortieren benötigt)

        for (int j = 0; j < this.partyPeoples.length -1; j++) {
            for (int i = 0; i < this.partyPeoples.length - 1; i++) {

                if (partyPeoples[i] == null) {
                    s = partyPeoples[i];
                    partyPeoples[i] = partyPeoples[i + 1];
                    partyPeoples[i + 1] = s;
                }
            }
        }
    }





}
