public class TourGuide extends Student{

    // Attribute des Tourguides
    private boolean readyToGo = false;
    private double tipSpended = 0;


    public TourGuide(String firstName, String lastName, String dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    private Student [] partyPeoples = new Student[5];


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

    public void printDataPartyPeoples () {
        for (int i = 0; i < partyPeoples.length; i++) {
            if (partyPeoples[i] != null) {
                System.out.println("Name " + partyPeoples[i].getFirstName() + " " + partyPeoples[i].getLastName() +
                        "\nMomentaner Kassenschnitt: " + partyPeoples[i].getMoney() +
                        "\nBetrunken: " + partyPeoples[i].isDrunk() + "\nBroke: " + partyPeoples[i].isBroke());
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
            if (partyPeoples[i] != null) {
                partyPeoples[i] = s;
                addedToTheCrew = true;
                System.out.println(s.getFirstName()+ " wurde erfolgreich zur Crew hinzugefügt!");
            }
            else {
                System.out.println("Die Stelle " + i + " im Array ist schon mit " + partyPeoples[i]);
            }
        }

        if (addedToTheCrew) {
            System.out.println(s.getFirstName() + " wurde erfolgreich zu deiner Crew hinzugefügt.");
        } else {
            System.out.println("Leider ist deine Crew schon voll");
        }
    }





}
