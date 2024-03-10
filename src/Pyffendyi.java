public class Pyffendyi extends HogwartsStudents {
    private int hardworking;
    private int loyal;
    private int honest;

    public Pyffendyi(String name, String lastName, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, lastName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public String toString() {
        return getName() +
                getLastName();
    }
}

