public class Pyffendyi extends Hogwarts {
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

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
