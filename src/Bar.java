public class Bar {

    /**
     * Zählt Bewertungen hoch
     */
    private String name;
    private double tips = 0;

    private static String [] barName = new String[] {"Hansbachbar", "Urban Spree Bar", "Klunkerkranich", "minimal Bar", "Radio Label Bar"};

    public Bar (String name) {
        this.name = name;
    }


    public static String getRandomBarName () {
        return barName[(int) (5 * Math.random())];
    }


    public Bar createRandomBar () {
        String name = getRandomBarName();
        System.out.println("Cool heute geht es also in die " + name +".\nNa dann los geht's");
        return new Bar (name);
    }


}
