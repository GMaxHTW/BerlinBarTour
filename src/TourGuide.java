public class TourGuide extends Student{

    // Attribute des Tourguides
    private boolean readyToGo = false;
    private double tipSpended = 0;


    public TourGuide(String firstName, String lastName, int yearOfBirth) {
        super(firstName, lastName, yearOfBirth);
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


    public void allGetADrink () {
        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] != null) {
                partyPeoples[i].getRandomDrink();
            }
        }
    }


    public void goToRandomBar() {
        this.Bar = Bar.createRandomBar();
    }

//    public void goToRandomBar() {
//        boolean readyToGo = checkCrewReadyToGo();
//        if (readyToGo) {
//            Bar = Bar.createRandomBar();
//        }
//    }





    public void addStudentToCrew (Student s) {

        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] == null) {
                partyPeoples[i] = s;
                System.out.println("\n" + s.getFirstName()+ " wurde erfolgreich zur Crew hinzugefügt!");
                break;
            }
        }
        if (checkCrewReadyToGo()) {
            System.out.println("\nDas Team ist jetzt vollzählig.\nJetzt können wir endlich los!!!");
        }


    }


    public void deleteStudent(String firstName, String lastName) {
        for (int i = 0; i < partyPeoples.length; i++) {
            Student student = partyPeoples[i];
            if (student.equals(firstName) && student.getLastName().equals(lastName)) {
                partyPeoples[i] = null;
                break;
            }
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


    /**
     * Methode organizeTeam
     * macht eigentlich erst richtig Sinn wenn man Methode delete Studente hat
     */
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
