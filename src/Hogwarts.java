public class Hogwarts {
    private String name;
    private String lastName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String lastName, int powerOfMagic, int transgressionDistance) {
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

  /*  public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

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

}
