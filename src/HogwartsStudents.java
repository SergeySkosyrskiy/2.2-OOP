public class HogwartsStudents {
    private String name;
    private String lastName;
    private int powerOfMagic;
    private int transgressionDistance;



    public HogwartsStudents(String name, String lastName, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}