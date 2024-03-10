public class Kogtevran extends HogwartsStudents {

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Kogtevran(String name, String lastName, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, lastName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public String toString() {
        return getName() +
                getLastName();
    }
}
