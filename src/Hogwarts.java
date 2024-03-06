public class Hogwarts {
    private String name;
    private String lastName;
    private int powerOfMagic;
    private int transgressionDistance;
    private final int id;
    private static int Counter = 1;

    public Hogwarts(String name, String lastName, int powerOfMagic, int transgressionDistance) {
        this.id = Counter++;
        this.name = name;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    @Override
    public String toString() {
        return super.toString() + "Name   " + name + lastName + powerOfMagic + transgressionDistance;
    }

    public int getId() {
        return id;
    }

}
