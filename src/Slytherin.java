public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(//int id,
                     String name, String lastName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super( //id,
                 name, lastName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public static void comparisonStudensts(Slytherin first, Slytherin second) {
        int firstStudSlytherin = first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getThirstForPower();
        int secondStudSlytherin = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getThirstForPower();
        if (firstStudSlytherin > secondStudSlytherin) {
            System.out.println(first.getName() + " Лучше Слизерин чем " + second.getName());
        } else System.out.println(second.getName() + " Лучше Слизерин чем " + first.getName());
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
